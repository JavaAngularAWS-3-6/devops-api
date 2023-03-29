# Cloud Fundamentals

Two options for hosting our app
- On premise
- On the cloud

## On Premise

Worry about security and routing

Worry about buying all the equipment and the up front costs that come along with that

Hire people to maintain and run that equipment

## Cloud Computing Definition

Utilizing resources from a server across the internet
- just a computer running somewhere that you have access to
- similar to renting memory/computing power from that computer on the internet

Offering infrastructure, resources, or applications over the internet

Why cloud computing?
- More flexible
- More scalable, and easier to scale
- More cost effective
- More availability
- Fault Tolorance

## Cloud Computing Models

Infrastructure as a Service
- renting out some server, where you have to manage
- amazon EC2
  - OS
  - DATA
  - RUNTIMES
  - APPLICATIONS

Platform as a Service
- renting some server that is preconfigured with services you need
- amazon RDS
    - DATA
    - APPLICATIONS

Software as a Service
- renting some software running on their servers
- Google Docs
  - Everything is being managed by the cloud provider, you just use the application

![models](https://f4n3x6c5.stackpathcdn.com/article/what-is-cloud-computing-explore-the-services-and-deployment-models/Images/IaaS-PaaS-SaaS-Cloud-Services.png)

![pizza as a service](https://www.coupa.com/sites/default/files/blog_images/content/blogs/pizza_as_a_service.png)

## Cloud Computing Service Providers

AWS - Amazon Web Services

Azure - (Microsoft)

GCP - Google Cloud Platform

## AWS - Amazon Web Services

Amazons entry into the cloud computing market
- Comprehensize cloud computing software
- Provides programmers with a wide range of computing services over the cloud, to aid in the development and deployment of applications
    - Storage, databases, machine learning, servless features, computing power

Why AWS?
- Cheaper than building infrastructure
  - pay-per-use/subscription model
  - no need to buy all the equipment to host server
- More scalable than in house solutions
  - Automatically scale resources during heavy traffic time
- Globally distribute products easily
- Amazon manage software or infrastructure for you

AWS Regions and Availability Zones

- AWS hosts its services across 77 availabilty zones in 24 regions
- Region: geographic location with clusters of available zones
  - Isolated and independent of other zones
  - Allows us to access services from across the globe
    - Faster and more reliable load times from basically everywhere
- Availablity Zone: physical building where Amazon servers live
  - Regions are made up of multiple Availability zones
    - redundancy for security and reliability
-   https://www.aws.amazon.com/about-aws/global-infrastructure

## Security and Access

VPC - Virtual Private Cloud

- Virtualized Network
  - Allow multiple resources to share a private network, and communicate with one another without being publically accessible

Security Groups
- virtual firewalls
- allow protocol and port level access to services
  - amazon uses block everything
  - make whitelists
- set of rules to filter incoming and outgoing traffic, this is how we can open up a port publically to a service