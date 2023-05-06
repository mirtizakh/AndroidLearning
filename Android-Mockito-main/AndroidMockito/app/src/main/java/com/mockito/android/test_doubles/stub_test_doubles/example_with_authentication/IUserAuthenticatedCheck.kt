package com.mockito.android.test_doubles.stub_test_doubles.example_with_authentication

import android.R.bool

// Let’s say I have an interface to tell me if a user is “authenticated” or not. It would look like so

interface IUserAuthenticatedCheck {
    fun isUserAuthenticated(): bool?
}

/* Now let’s say for my tests, I just always need the user to be authenticated,
maybe to fulfil some underlying framework condition. I could use a stub like so :

public class StubUserAuthenticatedCheckTrue : IUserAuthenticatedCheck
{
    public bool isUserAuthenticated() = true;
}

So no smarts on whether a user should be authenticated, no changing of the value,
just a straight “always return true” method. This is what stubs are great at.
 */



