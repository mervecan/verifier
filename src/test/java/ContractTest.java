import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import org.junit.runner.RunWith;


@RunWith(PactRunner.class) // Say JUnit to run tests with custom Runner
@Provider("Provider") // Set up name of tested provider
@PactFolder("/Users/merve/thesis/pacts") // Point where to find pacts (See also section Pacts source in documentation)

public class ContractTest {


    @State("retrieveAccount")
    // Method will be run before testing interactions that require "with-data" state
    public void retrieveAccount() {
        System.out.println("state");
    }

    @State("createAccount")
    // Method will be run before testing interactions that require "with-data" state
    public void createAccount() {
        System.out.println("state");
    }

    @State("createBankAccount")
    // Method will be run before testing interactions that require "with-data" state
    public void createBankAccount() {
        System.out.println("state");
    }

    @State("retrieveBankAccount")
    // Method will be run before testing interactions that require "with-data" state
    public void retrieveBankAccount() {
        System.out.println("state");
    }


    @State("createCreditCard")
    // Method will be run before testing interactions that require "with-data" state
    public void createCreditCard() {
        System.out.println("state");
    }


    @State("retrieveCreditCard")
    // Method will be run before testing interactions that require "with-data" state
    public void retrieveCreditCard() {
        System.out.println("state");
    }

    @State("createOrder")
    // Method will be run before testing interactions that require "with-data" state
    public void createOrder() {
        System.out.println("state");
    }


    @State("retrieveOrder")
    // Method will be run before testing interactions that require "with-data" state
    public void retrieveOrder() {
        System.out.println("state");
    }


    @TestTarget // Annotation denotes Target that will be used for tests
    public final Target target = new HttpTarget(9000); // Out-of-the-box implementation of Target (for more information take a look at Test Target section)


}