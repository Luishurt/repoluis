package es.imatia.RedSocial;

import java.util.*;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		//La lista de los usuarios que forman parte de la red social
		List<User>usersList = new ArrayList<>();
		//Usuarios
		User pepe = new User("pepe");
		User manolita = new User("manolita");
		User juan = new User("juan");
		User julia = new User("julia");
		User sandra = new User("sandra");
		User diego = new User("diego");
		User carlos = new User("carlos");
		
		//seguidores de pepe
		List<User> followedpepe = new ArrayList<>();
		followedpepe.add(manolita);
		followedpepe.add(diego);
		//seguidores de manolita
		List<User> followedmanolita = new ArrayList<>();
		followedmanolita.add(juan);
		followedmanolita.add(diego);
		
		//post de pepe
		Post imagepepe = new Image(LocalDate.of(2022, 5, 4),new ArrayList<Comment>(), "Selfie.jpg", 400, 450);
		Post textpepe = new Contents(LocalDate.of(2022, 4, 1),new ArrayList<Comment>(), "Hoy salí de acampada");
		List<Post> postlistpepe = new ArrayList<>();
		postlistpepe.add(imagepepe);
		postlistpepe.add(textpepe);
		
		//comentarios de diego y manolita en el post de pepe
		Comment commenttextpepediego = new Comment("Menuda suerte", LocalDate.of(2022, 4, 2), "diego");
		Comment commenttextpepemanolita = new Comment("Espero que no lloviese", LocalDate.of(2022, 4, 2), "manolita");
		ArrayList<Comment>commentlist = new ArrayList<>();
		commentlist.add(commenttextpepemanolita);
		commentlist.add(commenttextpepediego);
		//añadimos los comentarios al post de pepe
		textpepe.setListComment(commentlist);
		//añadimos la lista de post a pepe
		pepe.setListpost(postlistpepe);
		//añadimos amigos de pepe a pepe
		pepe.setFollowedlist(followedpepe);
		//añadimos amigos de manolita a manolita
		manolita.setFollowedlist(followedmanolita);
		
		//añadimos los usuarios a la lista de usuarios de la red social
		usersList.add(diego);
		usersList.add(carlos);
		usersList.add(pepe);
		usersList.add(manolita);
		usersList.add(julia);
		usersList.add(sandra);
		usersList.add(juan);
		

		//en el menú se llaman a las funcionalidades descritas en el pdf
		
		Scanner luisofo = new Scanner(System.in);
		String option = "-1";
		do {
			System.out.println("1. Agregar Usuario");
			System.out.println("2. Agregar Post");
			System.out.println("3. Agregar Comentario");
			System.out.println("4. Listar posts de un Usuario");
			System.out.println("5. Seguir a un usuario");
			System.out.println("6. Listar los comentarios de un usuario");
			System.out.println("7. Dejar de seguir a un usuario");
			System.out.println("8. Mostrar numero de comentarios de un Post");
			System.out.println("0. Terminar");
			option = luisofo.nextLine();
			switch (option) {
			case "1": 
				System.out.println("Por favor ingresa el nombre del usuario a crear");
				String nombreusuario = luisofo.nextLine();
				ArrayList<Post> postList = new ArrayList<>();
				ArrayList<User> userlist = new ArrayList<>();
				User username = new User(nombreusuario, userlist, postList);
				usersList.add(username);
				for(int i = 0; i < usersList.size(); i++) {
		            System.out.println(usersList.get(i).getName());
		        }
				break;
				
			case "2":
				System.out.println("Por favor ingresa el nombre del usuario que hara el Post");
				String usuariopost = luisofo.nextLine();
				System.out.println("Por favor indicar el tipo de Post que hara (Texto, Imagen o Video): " + usuariopost);
				String nuevopost = luisofo.nextLine();
					if (nuevopost.equals("Texto")){
						System.out.println("Ahora digite por favor el texto del post");
						String textopost = luisofo.nextLine();
						Post usuarioPost = new Contents(LocalDate.of(2022, 9, 10), new ArrayList<Comment>(), textopost);
						ArrayList<Post> usuariopostear = new ArrayList<Post>();
						usuariopostear.add(usuarioPost);
						System.out.println("El texto ha sido agregado correctamente");
					}
					if (nuevopost.equals("Imagen")){
						System.out.println("Por favor indique el titulo de la imagen:");
						String imagetitle = luisofo.nextLine();
						System.out.println("Ahora por favor indique el alto de la imagen:");
						Integer imageheight = luisofo.nextInt();
						System.out.println("Finalmente indique por favor el ancho de la imagen:");
						Integer imagewidth = luisofo.nextInt();
						ArrayList<Post> imagepost = new ArrayList<Post>();
						Post imagePost = new Image(LocalDate.of(2022, 9, 10), new ArrayList<Comment>(), imagetitle, imageheight, imagewidth);
						imagepost.add(imagePost);
						System.out.println("La imagen ha sido agregada correctamente");
					}
					if (nuevopost.equals("Video")){
						System.out.println("Por favor indique el titulo del video ");
						String videotitle = luisofo.nextLine();
						System.out.println("Ahora indique la calidad del video (240p, 360p, 480p, 720p, 1080p, 4k):");
						String videocalidad = luisofo.nextLine();
						System.out.println("Finalmente indique la duracion del video (en segundos):");
						Integer videolenght = luisofo.nextInt();
						ArrayList<Post> videopost = new ArrayList<Post>();
						Post videoPost = new Video(LocalDate.of(2022, 9, 10), new ArrayList<Comment>(), videotitle, videocalidad, videolenght);
						videopost.add(videoPost);
						System.out.println("El video ha sido agregado correctamente");
					}
					break;
			
			case "3":
				
				System.out.println("Indique por favor a que Post le hara su comentario");
					String postcommented = luisofo.nextLine();
					System.out.println("Por favor ingrese su comentario:");
					String comment = luisofo.nextLine();
					System.out.println("Por favor indique el nombre de quien hace el comentario");
					String usercommenting = luisofo.nextLine();
					ArrayList<Post> postlistcommented = new ArrayList<Post>(); 
					Comment commenttextuser = new Comment(comment, LocalDate.of(2022,9,10), usercommenting);
					commentlist.add(commenttextuser);
					
					
					System.out.println("El comentario ha sido agregado correctamente");
				for (Comment c:commentlist) {
					System.out.println(c.getCommentText());
				}
					
					break;
			
			case "6":
				
				for (Comment c:commentlist) {
					System.out.println(c.getCommentText());
				}			
				
				
			case "4":
				System.out.println("Por favor ingresa el nombre del Usuario del que quieres conocer sus Post");
				String nomusuario = luisofo.nextLine();
				User user = getUserByName(usersList, nomusuario);
				if(user != null) {
					System.out.println(user.getPostList());
					}
				break;
				
			case "5":
				System.out.println("Por favor ingresa el nombre del Usuario del que quieres seguir:");
				String usuarioaseguir = luisofo.nextLine();
				
			}
		} while(option.equals("0"));
		luisofo.close();
		
		
		
		
	}
	
	static User getUserByName(List<User> users, String userName) {
		for(User user : users) {
			if(user.getName().equals(userName)) {
				return user;
			}
		}
		return null;
		
		
	}

	}


