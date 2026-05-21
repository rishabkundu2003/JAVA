import java.util.*;

class Domain {

    public String extractDomain(String url) {

        url = url.replace("https://", "");
        url = url.replace("http://", "");

        if (url.startsWith("www.")) {
            url = url.substring(4);
        }

        int slashIndex = url.indexOf("/");

        if (slashIndex != -1) {
            url = url.substring(0, slashIndex);
        }

        return url;
    }
}

public class URL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter URL: ");
        String url = sc.nextLine();

        Domain obj = new Domain();

        System.out.println("Domain: " +
                obj.extractDomain(url));
    }
}