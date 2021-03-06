//package com.tests;
//
//import com.application.DriverFactory;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class BrokenLinkProgram {
//
//        private WebDriver driver = null;
//
//        public static void main(String[] args) {
//// TODO Auto-generated method stub
//            DriverFactory dr = new DriverFactory();
//            driver = dr.startBrowser("chrome");
//
//            String homePage = "http://www.zlti.com";
//            String url = "";
//            HttpURLConnection huc = null;
//            int respCode = 200;
//
//            driver = new ChromeDriver();
//
//            driver.manage().window().maximize();
//
//            driver.get(homePage);
//
//            List<WebElement> links = driver.findElements(By.tagName("a"));
//
//            Iterator<WebElement> it = links.iterator();
//
//            while(it.hasNext()){
//
//                url = it.next().getAttribute("href");
//
//                System.out.println(url);
//
//                if(url == null || url.isEmpty()){
//                    System.out.println("URL is either not configured for anchor tag or it is empty");
//                    continue;
//                }
//
//                if(!url.startsWith(homePage)){
//                    System.out.println("URL belongs to another domain, skipping it.");
//                    continue;
//                }
//
//                try {
//                    huc = (HttpURLConnection)(new URL(url).openConnection());
//
//                    huc.setRequestMethod("HEAD");
//
//                    huc.connect();
//
//                    respCode = huc.getResponseCode();
//
//                    if(respCode >= 400){
//                        System.out.println(url+" is a broken link");
//                    }
//                    else{
//                        System.out.println(url+" is a valid link");
//                    }
//
//                } catch (MalformedURLException e) {
//// TODO Auto-generated catch block
//                    e.printStackTrace();
//                } catch (IOException e) {
//// TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//
//            driver.quit();
//
//        }
//
//}
