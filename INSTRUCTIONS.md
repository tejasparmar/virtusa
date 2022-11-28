# Android Coding Challenge

## Scenario
Imagine you have just formed a new a mobile team, tasked with maintaining an existing banking application.
- The application is live on the Play Store.
- CI/CD is set up to build a new version and push to the Play Store on every push to the repository.

Currently, the banking application allows its users to **deposit** and **withdraw** money from their bank account. 
If the user does not have enough money, the app prevents them from making that withdrawal.

Example: Deposit:50.00(ok), Withdraw:25.00(ok), Withdraw:25.00(ok), Withdraw:0.1(not ok)

Note: This feature is currently implemented locally, the API to support this feature is still being worked on by the backend team but should be available in the near future.   

## Setup
- Create a new [Trello account](https://trello.com/) and set up a board to represent the Project that you are managing/working on.
- Invite `tim@myzeller.com` and `chris.hatton@myzeller.com` to the Trello board

## Your tasks
We'd like to see both your personal coding approach to this problem, and the way you'd guide a team to achieve a similar outcome.

### Part 1: Coding challenge
- Introduce a new feature that allows the user to view their past transactions
- Improve the current code which was intentionally made with poor programming practices and a few bugs
- Improvements are to be made without completely rewriting the app

### Part 2: Team Planning
- Imagine that you had to achieve the same requirements as Part 1, but instead of coding the solution directly, you
  have to provide requirements to your team of three developers who also had no previous exposure to the codebase.
- Create 'tickets' on the Trello board that you prepared in the `Setup` step above, so that the work can be efficiently
  divided among the team.  Provide enough context that these new developers can understand the problem and are
  empowered to succeed at their tasks.

## Expectations
The task is not simple enough to easily refactor in a couple sittings, what we're after is seeing your refactoring strategy.
We also don't expect the you to refactor everything, instead, we'd like you to tell us what you found important to change and why.
We expect that the repository is always at a releasable state. It is important to make sure that any change does not introduce any regressions or bugs.

There are no expectations that what you have done in `Part 1` matches the tickets that you have written in `Part 2`. 
What we are looking for is an insight into how you would break down a task like this with multiple developers. 

We understand that everybody's situation is different that's why we give candidates several days to complete the exercise. 
Having said that, we don't expect you to spend more than a normal working day to complete this exercise and will assess
it accordingly.

It's okay to defer decisions or improvements that would exceed the time available.
Please just make a note of these, and any assumptions you have made, in your README file.

### What we're looking for
- Small incremental improvements – commit in small deliverable chunks
- Use of a Depedency Injection Framework - Dagger preferred, but not required.
- A testing strategy to support the refactoring
- Simple and concise code
- Proper modelling of the domain
- A reasonable but scalable architecture
- A README that will help other developers
- A task breakdown that

### What you will be submitting
- A zip file of the entire project including the .git folder -- the git history is an important part of this submission.
- A README that details the decisions you've made. This is a good place to write which improvements you've deferred but would like to work on given more time.
- An Invitation to the Trello board that you have created.

## Questions?
- All questions are good questions. If you have any, please don't hesitate to send us an e-mail, copying both tim@myzeller.com & chris.hatton@myzeller.com

Good luck and happy coding!
