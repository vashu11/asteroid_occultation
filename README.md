# asteroid_occultation

We already keep track of the most of big near-Earth asteroids. But when it comes to small sized ones – we are basically ignorant of them. For example, we estimate that there is at least 1 million of 40 m  near Earth asteroids, and we discovered at most 1% of them.

In order to detect an asteroid we need a telescope. All ongoing asteroid detection projects(NEAT, LONEOS, CINEOS, etc.) use big and very expensive telescopes. But even with big telescope it is hard to detect 40 meter rock tens of millions kilometres away.

We propose change of paradigm – by using thousands of low cost telescope we will watch out for asteroid occultations. Star shadow of asteroid moving across Earth surface will create a pattern of occultation detections in our telescope array and by using machine learning technics we will produce current asteroid celestial coordinates.

The good news are that we can get a lot of telescopes for free – there are thousands of amateur owned computer controlled, digital camera compatible telescopes! All we need to do is to help amateurs to connect them to Internet!

The following software implements detection of asteroid shadow despite noise in telescope CCD.

## Software and versions
- python
- Java 7

## Implementation
### Simulation
Simulation is implemented as python script.

### Solution
Solution is a Java program.

## How to launch
Compile Java code and execute:

```java solution.SmartSolutionManager NUMBER_OF_ITERATIONS```

NUMBER_OF_ITERATIONS is an optional parameter indicating the number of times the algorithm will be executed.

That will run simulation and solution. A new set of data input files is generated on every iteration.

The output of the program is result.txt file containing the list of errors for each iteration and also the number of iterations with no solutions.


## Sample data
See sample input and output data within the doc folder.