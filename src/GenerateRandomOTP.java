import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomOTP {

	public static void main(String[] args) {
		
			
				/*
				//2. Generate Random Unbounded String With Plain Java
				    byte[] array = new byte[7]; // length is bounded by 7
				    new Random().nextBytes(array);
				    String generatedString = new String(array, Charset.forName("UTF-8"));

				    System.out.println(generatedString);
				    */
				
				
				/*
				//Generate Random Bounded String With Plain Java
				int leftLimit = 97; // letter 'a'
			    int rightLimit = 122; // letter 'z'
			    int targetStringLength = 10;
			    Random random = new Random();
			    StringBuilder buffer = new StringBuilder(targetStringLength);
			    for (int i = 0; i < targetStringLength; i++) {
			        int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			        buffer.append((char) randomLimitedInt);
			    }
			    String generatedString = buffer.toString();

			    System.out.println(generatedString);
			    */
				
				
				/*
				 //5. Generate Random Alphanumeric String With Java 8
				  int leftLimit = 48; // numeral '0'
				    int rightLimit = 122; // letter 'z'
				    int targetStringLength = 10;
				    Random random = new Random();

				    String generatedString = random.ints(leftLimit, rightLimit + 1)
				      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
				      .limit(targetStringLength)
				      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				      .toString();

				    System.out.println(generatedString);
				    
				    */
				
				
				//Generate Alphanumeric String With Apache Commons Lang
				String generatedString = RandomStringUtils.randomAlphanumeric(5);

			    System.out.println(generatedString);
				}
			

		

	}


