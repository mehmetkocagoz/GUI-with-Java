import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GUI {
    //All Frames
    JFrame mainWindow = new JFrame("Main Frame");
    JFrame frame = new JFrame("Functions");
    JFrame addMovieWindow = new JFrame("Add Movie");
    JFrame addStarWindow = new JFrame("Add Star");
    JFrame addPersonWindow = new JFrame("Add Person");
    JFrame showMovieWindow = new JFrame("Show Movie");
    JFrame increaseTimeWindow = new JFrame("Increase Time");
    JFrame showImageWindow = new JFrame("Show Poster");
    JFrame showStarWindow = new JFrame("Show Star");
    JFrame showGenreWindow = new JFrame("Show By Genre");

    //Main Window Components
    JButton loginButton = new JButton("Login");
    JTextField usernameText = new JTextField();
    JLabel usernameLabel = new JLabel("Username :");

    //Function Window Components
    JButton addMovie = new JButton("Add Movie");
    JButton addStar = new JButton("Add Star");
    JButton addPerson = new JButton("Add Person");
    JButton showMovie = new JButton("Show Movie");
    JButton increaseWatchTime = new JButton("Increase Watched Time");
    JButton showImage = new JButton("Show Poster");
    JButton showHighestRate = new JButton("Show Highest Rate");
    JButton showStars = new JButton("Show Stars");


    //Add Movie Window Components
    JLabel  Title = new JLabel("Title :");
    JLabel  Year = new JLabel("Year :");
    JLabel  Length = new JLabel("Length :");
    JLabel Genre = new JLabel("Genre :");
    JLabel  StudioName= new JLabel("StudioName :");
    JLabel  ProducerName= new JLabel("ProducerName :");
    JLabel  ShortDescription= new JLabel("ShortDescription :");
    JTextField titleTextField = new JTextField();
    JTextField yearTextField = new JTextField();
    JTextField lengthTextField = new JTextField();
    JTextField genreTextField = new JTextField();
    JTextField studioNameTextField = new JTextField();
    JTextField producerNameTextField = new JTextField();
    JTextField shortDescriptionTextField = new JTextField();
    JButton AddMovieButton = new JButton("ADD");


    //Add Star Window Components
    //I will use Add Movie Window's movieTitle and movieYear components
    JLabel movieID = new JLabel("MovieID :");
    JLabel nameSurname = new JLabel("Star Name :");
    JTextField movieIDTextField = new JTextField();
    JTextField nameSurnameTextField = new JTextField();
    JButton addStarButton = new JButton("ADD");


    //Add Person Window Components
    //I will use Add Star Window's movieID component
    JLabel userNameSurname = new JLabel("UserName :");
    JLabel relation = new JLabel("Relation :");
    JLabel rating = new JLabel("Rate :");
    JTextField userNameSurnameText = new JTextField();
    JTextField relationTextField = new JTextField();
    JTextField ratingTextField = new JTextField();
    JButton addPersonButton = new JButton("ADD");


    //Show Movie Window Components
    //I will use addStar window's movieID component
    JButton searchButton = new JButton("Search");
    //Increase Window Components
    //I will use addStar window's movieID component
    JButton searchButton1 = new JButton("Search");
    JLabel numWatched = new JLabel("Watched Time :");
    JTextField numWatchedText = new JTextField();
    //Show Image Window Components
    //I will use show image window's movieID component
    JButton searchButton2 = new JButton("Search");
    JLabel imageLabel = new JLabel("Poster");

    //Show Star Window Components
    //I will use addMovie window's Title component
    JButton searchButton3= new JButton("Search");
    //Show By Genre Window Components
    //I will use addMovie window's genre component
    JButton searchButton4 = new JButton("Search");
    JComboBox comboBox;
    public void mainWindow()
    {
        mainWindow.setLayout(new BorderLayout());
        JPanel panel = new JPanel(null);
        mainWindow.add(panel);

        loginButton.setBounds(20,150,250,50);
        usernameLabel.setBounds(20,45,100,30);
        usernameText.setBounds(120,45,150,40);


        panel.add(loginButton);
        panel.add(usernameLabel);
        panel.add(usernameText);

        mainWindow.setSize(300,300);
        mainWindow.setVisible(true);
        mainWindow.setResizable(false);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void functionWindow()
    {

        frame.setSize(600,500);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(400,500);
        frame.add(panel);

        addMovie.setBounds(5,5,200,30);
        addStar.setBounds(5,45,200,30);
        addPerson.setBounds(5,85,200,30);
        showMovie.setBounds(5,125,200,30);
        increaseWatchTime.setBounds(5,165,200,30);
        showImage.setBounds(5,205,200,30);
        showHighestRate.setBounds(5,245,200,30);
        showStars.setBounds(5,285,200,30);

        panel.add(addMovie);
        panel.add(addStar);
        panel.add(addPerson);
        panel.add(showMovie);
        panel.add(increaseWatchTime);
        panel.add(showImage);
        panel.add(showHighestRate);
        panel.add(showStars);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void addMovieWindow()
    {
        addMovieWindow.setSize(600,500);
        JPanel panel = new JPanel(null);
        panel.setSize(550,450);
        addMovieWindow.add(panel);

        Title.setBounds(5,5,200,30);
        Year.setBounds(5,45,200,30);
        Length.setBounds(5,85,200,30);
        Genre.setBounds(5,125,200,30);
        StudioName.setBounds(5,165,200,30);
        ProducerName.setBounds(5,205,200,30);
        ShortDescription.setBounds(5,245,200,30);

        titleTextField.setBounds(215,5,200,30);
        yearTextField.setBounds(215,45,200,30);
        lengthTextField.setBounds(215,85,200,30);
        genreTextField.setBounds(215,125,200,30);
        studioNameTextField.setBounds(215,165,200,30);
        producerNameTextField.setBounds(215,205,200,30);
        shortDescriptionTextField.setBounds(215,245,200,30);
        AddMovieButton.setBounds(205,355,200,30);

        panel.add(Title);
        panel.add(Year);
        panel.add(Length);
        panel.add(Genre);
        panel.add(StudioName);
        panel.add(ProducerName);
        panel.add(ShortDescription);

        panel.add(titleTextField);
        panel.add(yearTextField);
        panel.add(lengthTextField);
        panel.add(genreTextField);
        panel.add(studioNameTextField);
        panel.add(producerNameTextField);
        panel.add(shortDescriptionTextField);
        panel.add(AddMovieButton);

        addMovieWindow.setVisible(true);
        addMovieWindow.setResizable(false);
        addMovieWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addStarWindow()
    {
        addStarWindow.setSize(500,300);
        JPanel panel = new JPanel(null);
        panel.setSize(550,250);
        addStarWindow.add(panel);

        movieID.setBounds(5,5,200,30);
        Title.setBounds(5,45,200,30);
        Year.setBounds(5,85,200,30);
        nameSurname.setBounds(5,125,200,30);

        movieIDTextField.setBounds(215,5,200,30);
        titleTextField.setBounds(215,45,200,30);
        yearTextField.setBounds(215,85,200,30);
        nameSurnameTextField.setBounds(215,125,200,30);

        addStarButton.setBounds(150,200,200,30);

        panel.add(movieID);
        panel.add(Title);
        panel.add(Year);
        panel.add(nameSurname);

        panel.add(movieIDTextField);
        panel.add(titleTextField);
        panel.add(yearTextField);
        panel.add(nameSurnameTextField);
        panel.add(addStarButton);

        addStarWindow.setResizable(false);
        addStarWindow.setVisible(true);
        addStarWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void addPersonWindow()
    {
        addPersonWindow.setSize(500,300);
        JPanel panel = new JPanel(null);
        panel.setSize(550,250);
        addPersonWindow.add(panel);

        movieID.setBounds(5,5,200,30);
        userNameSurname.setBounds(5,45,200,30);
        relation.setBounds(5,85,200,30);
        rating.setBounds(5,125,200,30);

        movieIDTextField.setBounds(210,5,200,30);
        userNameSurnameText.setBounds(210,45,200,30);
        relationTextField.setBounds(210,85,200,30);
        ratingTextField.setBounds(210,125,200,30);

        addPersonButton.setBounds(150,200,200,30);

        panel.add(movieID);
        panel.add(userNameSurname);
        panel.add(relation);
        panel.add(rating);

        panel.add(movieIDTextField);
        panel.add(userNameSurnameText);
        panel.add(relationTextField);
        panel.add(ratingTextField);
        panel.add(addPersonButton);

        addPersonWindow.setVisible(true);
        addPersonWindow.setResizable(false);
        addPersonWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void showMovieWindow()
    {
        showMovieWindow.setSize(250,160);
        JPanel panel = new JPanel(null);
        panel.setSize(250,150);
        showMovieWindow.add(panel);

        Title.setBounds(5,5,200,30);
        titleTextField.setBounds(5,45,200,30);
        searchButton.setBounds(5,80,100,30);

        panel.add(Title);
        panel.add(titleTextField);
        panel.add(searchButton);

        showMovieWindow.setVisible(true);
        showMovieWindow.setResizable(false);
    }
    public void increaseWindow()
    {
        increaseTimeWindow.setSize(400,200);
        JPanel panel = new JPanel(null);
        panel.setSize(400,150);
        increaseTimeWindow.add(panel);

        movieID.setBounds(5,5,150,30);
        numWatched.setBounds(5,45,150,30);
        movieIDTextField.setBounds(165,5,200,30);
        numWatchedText.setBounds(165,45,200,30);
        searchButton1.setBounds(5,80,100,30);

        panel.add(movieID);
        panel.add(movieIDTextField);
        panel.add(numWatched);
        panel.add(numWatchedText);
        panel.add(searchButton1);

        increaseTimeWindow.setVisible(true);
        increaseTimeWindow.setResizable(false);
    }
    public void showImageWindow()
    {
        showImageWindow.setSize(600,600);
        JPanel panel = new JPanel(null);
        panel.setSize(500,500);
        showImageWindow.add(panel);

        movieID.setBounds(5,420,200,30);
        movieIDTextField.setBounds(210,420,200,30);
        searchButton2.setBounds(5,480,100,30);
        imageLabel.setBounds(10,10,400,400);

        panel.add(movieID);
        panel.add(movieIDTextField);
        panel.add(searchButton2);
        panel.add(imageLabel);

        showImageWindow.setVisible(true);
        showImageWindow.setResizable(false);
    }
    public void showStarWindow()
    {
        showStarWindow.setSize(450,160);
        JPanel panel = new JPanel(null);
        panel.setSize(450,150);
        showStarWindow.add(panel);

        nameSurname.setBounds(5,5,150,30);
        nameSurnameTextField.setBounds(165,5,200,30);
        searchButton3.setBounds(5,80,100,30);

        panel.add(nameSurnameTextField);
        panel.add(nameSurname);
        panel.add(searchButton3);

        showStarWindow.setVisible(true);
        showStarWindow.setResizable(false);
    }
    public void showByGenreWindow()
    {
        showGenreWindow.setSize(300,200);
        JPanel panel = new JPanel(null);
        panel.setSize(250,200);
        showGenreWindow.add(panel);

        String genre[] = {"Horror","Comedy","Romantic","War"};
        comboBox = new JComboBox<>(genre);
        comboBox.setBounds(5,5,150,30);
        searchButton4.setBounds(160,5,100,30);

        panel.add(comboBox);
        panel.add(searchButton4);

        showGenreWindow.setVisible(true);
        showGenreWindow.setResizable(false);
    }
    public void functionListeners()
    {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try {
                    if((checkUserName())==true)
                    {
                        functionWindow();
                    }
                    else JOptionPane.showMessageDialog(mainWindow,"Wrong username!!");
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        addMovie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                addMovieWindow();
            }
        });

        addStar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {addStarWindow();}
        });

        addPerson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {addPersonWindow();}
        });

        showMovie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {showMovieWindow();}
        });

        increaseWatchTime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {increaseWindow();}
        });

        showImage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {showImageWindow();}
        });

        showHighestRate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {showByGenreWindow();}
        });

        showStars.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {showStarWindow();}
        });

        AddMovieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String movieInfo = null;
                try {
                    if (checkMovie(titleTextField.getText())==true)
                    {
                        JOptionPane.showMessageDialog(addMovieWindow,"DuplicateMovie");
                    }
                    else
                    {
                        String lastID = checkMovieID();
                        movieInfo =lastID+" "+titleTextField.getText()+" "+yearTextField.getText()+" "+lengthTextField.getText()+" "+genreTextField.getText()+" "+studioNameTextField.getText()+" "+producerNameTextField.getText()+" "
                        +shortDescriptionTextField.getText()+" 0 0";
                        writeFile(movieInfo,"Movies.txt");
                        JOptionPane.showMessageDialog(addMovieWindow,"Movie added with ID :"+lastID);
                    }

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        addStarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String starInfo = null;
                try {
                    if (checkForMovieID(movieIDTextField.getText()))
                    {
                        starInfo =movieIDTextField.getText()+" "+titleTextField.getText()+" "+yearTextField.getText()+" "+nameSurnameTextField.getText();
                        writeFile(starInfo,"Stars.txt");
                        JOptionPane.showMessageDialog(addStarWindow,"Star "+nameSurnameTextField.getText()+" added!");
                    }
                    else
                    {

                        JOptionPane.showMessageDialog(addStarWindow,"Wrong movieID!");
                    }
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        addPersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String personInfo = null;
                String avg = null;
                try {
                    if (checkForMovieID(movieIDTextField.getText()))
                    {
                        personInfo = movieIDTextField.getText()+" "+userNameSurnameText.getText()+" "+relationTextField.getText()+" "+ratingTextField.getText();
                        writeFile(personInfo,"Ratings.txt");
                        avg = calculateAvg(movieIDTextField.getText());
                        writeAvg(avg,movieIDTextField.getText());
                        JOptionPane.showMessageDialog(addPersonWindow,userNameSurnameText.getText()+"'s rate for movieID "+movieIDTextField.getText()+" : "+ratingTextField.getText());
                    }
                    else JOptionPane.showMessageDialog(addPersonWindow,"Wrong movieID!");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            String title = titleTextField.getText();
                try {
                    showMovie(title);
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        searchButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {   System.out.println("HERE");
                try {
                    increaseTime(movieIDTextField.getText(),numWatchedText.getText());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        searchButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                BufferedImage image;
                try {
                    //The image file should be in the project folder ".../imageexercise/Book1Cover.jpg".
                    image = ImageIO.read(new File("Poster"+movieIDTextField.getText()+".jpg"));
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                    imageLabel.setIcon(new ImageIcon(image));
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(showImageWindow,"Wrong movie ID");
                }
            }
        });
        searchButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try {
                  findStarMovie(nameSurnameTextField.getText());
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        searchButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String data = (String) comboBox.getItemAt(comboBox.getSelectedIndex());
                try {
                    findHighestRate(data);
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }


    private void findHighestRate(String data) throws FileNotFoundException {
        File file = new File("Movies.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> rates = new ArrayList<>();
        String a,b,c,d,e,f,g,h,k,l;
        String highestRate = null;
        String title = null;
        while (scanner.hasNext())
        {
            a = scanner.next();
            b = scanner.next();
            c = scanner.next();
            d = scanner.next();
            e = scanner.next();
            f = scanner.next();
            g = scanner.next();
            h = scanner.next();
            k = scanner.next();
            l = scanner.next();
            if (e.equals(data))
            {
                rates.add(k);
                title=b;
            }
        }
        scanner.close();
        if (rates.size()==1)
        {
            highestRate = rates.get(0);
            JOptionPane.showMessageDialog(showGenreWindow,title+" "+highestRate);
            System.exit(0);
        }
        else if (rates.size()>1)
        {
            for (int i = 0; i < rates.size()-1; i++) {
                highestRate = rates.get(0);
                if ((Double.parseDouble(rates.get(i)))<(Double.parseDouble(rates.get(i+1)))){
                    highestRate = rates.get(i+1);
                    i++;
                }else i++;
            }
        }
        JOptionPane.showMessageDialog(showGenreWindow,title+" : "+highestRate);
    }
    private void findStarMovie(String text) throws FileNotFoundException {
        File file = new File("Stars.txt");
        Scanner scanner = new Scanner(file);
        String movieName = null;
        String a,b,c,d;

        while (scanner.hasNext()){
            a = scanner.next();
            b = scanner.next();
            c = scanner.next();
            d = scanner.next();
            if (d.equals(text))
            {
                movieName=b;
            }
        }
        JOptionPane.showMessageDialog(showStarWindow,"Star "+text+" was in "+movieName);
    }
    private void increaseTime(String movieID, String numWatched) throws IOException {
        int i = 0;
        String ID,Title,Year,a,b,c,d,e,f,g;
        File file = new File("Movies.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> elements = new ArrayList<String>();
        String holder = null;
        while (scanner.hasNext())
        {
            ID = scanner.next();
            Title = scanner.next();
            Year = scanner.next();
            a = scanner.next();
            b = scanner.next();
            c = scanner.next();
            d = scanner.next();
            e = scanner.next();
            f = scanner.next();
            g = scanner.next();
            if (ID.equals(movieID)){
                holder = ID+" "+Title+" "+Year+" "+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+numWatched;
            }else holder = ID+" "+Title+" "+Year+" "+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g;
            elements.add(holder);
        }
        scanner.close();
        BufferedWriter w = new BufferedWriter(new FileWriter("Movies.txt"));

        int count = elements.size();
        for (String str:elements){
            if (i==count-1){
                w.write(str);
            }
            else {
                w.write(str);
                w.newLine();
            }
            i++;
        }
        w.close();
    }
    private void showMovie(String title) throws FileNotFoundException {
        File file = new File("Movies.txt");
        Scanner scanner = new Scanner(file);
        String word;
        boolean a = true;
        while (scanner.hasNext())
        {
            word=scanner.next();
            if (scanner.next().equals(title))
            {
                JOptionPane.showMessageDialog(showMovieWindow,"Movie ID :"+word);
            }
            scanner.nextLine();
        }
    }
    public void writeAvg(String avg, String movieID) throws IOException {
        int i = 0;
        String ID,Title,Year,a,b,c,d,e,f,g;
        File file = new File("Movies.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> elements = new ArrayList<String>();
        String holder = null;
        while (scanner.hasNext())
        {
            ID = scanner.next();
            Title = scanner.next();
            Year = scanner.next();
            a = scanner.next();
            b = scanner.next();
            c = scanner.next();
            d = scanner.next();
            e = scanner.next();
            f = scanner.next();
            g = scanner.next();
            if (ID.equals(movieID)){
                holder = ID+" "+Title+" "+Year+" "+a+" "+b+" "+c+" "+d+" "+e+" "+avg+" "+g;
            }else holder = ID+" "+Title+" "+Year+" "+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g;
            elements.add(holder);
        }
        scanner.close();
        BufferedWriter w = new BufferedWriter(new FileWriter("Movies.txt"));

        int count = elements.size();
        for (String str:elements){
            if (i==count-1){
                w.write(str);
            }
            else {
                w.write(str);
                w.newLine();
            }
            i++;
        }
        w.close();
    }
    private String calculateAvg(String text) throws FileNotFoundException {
        File file = new File("Ratings.txt");
        Scanner scanner = new Scanner(file);
        String rate;
        int count = 0;
        double sum = 0;
        while (scanner.hasNextLine())
        {
            if (scanner.next().equals(text))
            {
                scanner.next();
                scanner.next();
                rate = scanner.next();
                count++;
                sum+=Double.parseDouble(rate);
            } else scanner.nextLine();
        }
        sum = sum/count;
        rate=String.valueOf(sum);
        return rate;
    }
    private String checkMovieID() throws FileNotFoundException {
        File file = new File("Movies.txt");
        Scanner scanner = new Scanner(file);
        String lastID = null;
        while (scanner.hasNextLine())
        {
            lastID = scanner.next();
            scanner.nextLine();
        }
        int holder;
        holder=Integer.parseInt(lastID);
        holder+=1;
        lastID = String.valueOf(holder);
        return lastID;
    }
    private boolean checkForMovieID(String text) throws FileNotFoundException {
        File file = new File("Movies.txt");
        Scanner scanner = new Scanner(file);
        String word;
        boolean a = true;
        while (scanner.hasNext())
        {
            word=scanner.next();
            if (word.equals(text))
            {
                a=true;
                return a;
            }else a = false;

            scanner.nextLine();

        }
        return a;
    }
    private boolean checkMovie(String text) throws FileNotFoundException {
            File file = new File("Movies.txt");
            Scanner scanner = new Scanner(file);
            String word;
            boolean a = true;
             while (scanner.hasNext())
             {
                  word = scanner.nextLine();
                  if (word.contains(text))
                  {
                      a = true;
                      return a;
                  } else a = false;
             }
             return a;
    }
    private void writeFile(String input,String fileName) throws IOException {
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter(fileName,true));
            w.newLine();
            w.write(input);
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private boolean checkUserName() throws FileNotFoundException {
        boolean a = true;
        File file = new File("Users.txt");
        Scanner scanner = new Scanner(file);
        String holder;
        String text ;
        text = usernameText.getText();
        while (scanner.hasNext())
        {

            holder = scanner.next();
            if (holder.equals(text))
            {
                a = true;
                return a;
            }else a = false;
        }
        return a;
    }

    public void readFile(String fileName) throws FileNotFoundException {

        BufferedReader b = new BufferedReader(new FileReader(fileName));
        String line = null;
        try{
            while ((line = b.readLine()) != null)
            {
                String[] words = line.split(",");
                for (String str : words)
                {
                    System.out.println(str);
                }
                System.out.println();
            }
            b.close();
        }
        catch (IOException ex)
        {
            System.out.println("Error: file cannot be opened.");
        }
    }

    public static void main(String arg[]) throws IOException
    {
        GUI run = new GUI();
        run.functionListeners();
        run.mainWindow();
    }
}