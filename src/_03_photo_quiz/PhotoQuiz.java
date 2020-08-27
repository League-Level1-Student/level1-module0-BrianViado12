package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String link = "https://i.imgflip.com/3s70wy.png";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(link);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("What is wrong in this picture?");
		// 7. print "CORRECT" if the user gave the right answer
		if(question.equalsIgnoreCase("nothing")) {
		System.out.println("Correct!");
		} else if(question.equalsIgnoreCase("storm")) {
			System.out.println(("Correct!"));
		} else {
			System.out.println("Incorrect");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
			
		// 10. find another image and create it (might take more than one line
		// of code)
		String picture ="https://i.kym-cdn.com/entries/icons/facebook/000/034/772/Untitled-1.jpg";
		Component image2;
		image2 =createImage(picture);
		// 11. add the second image to the quiz window
		quizWindow.add(image2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer = JOptionPane.showInputDialog("Why is the cat sad?");
		// 14+ check answer, say if correct or incorrect, etc.
			if(answer.equalsIgnoreCase("they did something unappreciated")) {
				System.out.println("Correct!");
			} else {
				System.out.println("Incorrect");
			}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
