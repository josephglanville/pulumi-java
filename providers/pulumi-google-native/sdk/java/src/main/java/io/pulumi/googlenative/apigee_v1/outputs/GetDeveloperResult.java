// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1AttributeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeveloperResult {
    /**
     * Access type.
     * 
     */
    private final String accessType;
    /**
     * Developer app family.
     * 
     */
    private final String appFamily;
    /**
     * List of apps associated with the developer.
     * 
     */
    private final List<String> apps;
    /**
     * Optional. Developer attributes (name/value pairs). The custom attribute limit is 18.
     * 
     */
    private final List<GoogleCloudApigeeV1AttributeResponse> attributes;
    /**
     * List of companies associated with the developer.
     * 
     */
    private final List<String> companies;
    /**
     * Time at which the developer was created in milliseconds since epoch.
     * 
     */
    private final String createdAt;
    /**
     * ID of the developer. **Note**: IDs are generated internally by Apigee and are not guaranteed to stay the same over time.
     * 
     */
    private final String developerId;
    /**
     * Email address of the developer. This value is used to uniquely identify the developer in Apigee hybrid. Note that the email address has to be in lowercase only.
     * 
     */
    private final String email;
    /**
     * First name of the developer.
     * 
     */
    private final String firstName;
    /**
     * Time at which the developer was last modified in milliseconds since epoch.
     * 
     */
    private final String lastModifiedAt;
    /**
     * Last name of the developer.
     * 
     */
    private final String lastName;
    /**
     * Name of the Apigee organization in which the developer resides.
     * 
     */
    private final String organizationName;
    /**
     * Status of the developer. Valid values are `active` and `inactive`.
     * 
     */
    private final String status;
    /**
     * User name of the developer. Not used by Apigee hybrid.
     * 
     */
    private final String userName;

    @CustomType.Constructor
    private GetDeveloperResult(
        @CustomType.Parameter("accessType") String accessType,
        @CustomType.Parameter("appFamily") String appFamily,
        @CustomType.Parameter("apps") List<String> apps,
        @CustomType.Parameter("attributes") List<GoogleCloudApigeeV1AttributeResponse> attributes,
        @CustomType.Parameter("companies") List<String> companies,
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("developerId") String developerId,
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("firstName") String firstName,
        @CustomType.Parameter("lastModifiedAt") String lastModifiedAt,
        @CustomType.Parameter("lastName") String lastName,
        @CustomType.Parameter("organizationName") String organizationName,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("userName") String userName) {
        this.accessType = accessType;
        this.appFamily = appFamily;
        this.apps = apps;
        this.attributes = attributes;
        this.companies = companies;
        this.createdAt = createdAt;
        this.developerId = developerId;
        this.email = email;
        this.firstName = firstName;
        this.lastModifiedAt = lastModifiedAt;
        this.lastName = lastName;
        this.organizationName = organizationName;
        this.status = status;
        this.userName = userName;
    }

    /**
     * Access type.
     * 
    */
    public String getAccessType() {
        return this.accessType;
    }
    /**
     * Developer app family.
     * 
    */
    public String getAppFamily() {
        return this.appFamily;
    }
    /**
     * List of apps associated with the developer.
     * 
    */
    public List<String> getApps() {
        return this.apps;
    }
    /**
     * Optional. Developer attributes (name/value pairs). The custom attribute limit is 18.
     * 
    */
    public List<GoogleCloudApigeeV1AttributeResponse> getAttributes() {
        return this.attributes;
    }
    /**
     * List of companies associated with the developer.
     * 
    */
    public List<String> getCompanies() {
        return this.companies;
    }
    /**
     * Time at which the developer was created in milliseconds since epoch.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * ID of the developer. **Note**: IDs are generated internally by Apigee and are not guaranteed to stay the same over time.
     * 
    */
    public String getDeveloperId() {
        return this.developerId;
    }
    /**
     * Email address of the developer. This value is used to uniquely identify the developer in Apigee hybrid. Note that the email address has to be in lowercase only.
     * 
    */
    public String getEmail() {
        return this.email;
    }
    /**
     * First name of the developer.
     * 
    */
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Time at which the developer was last modified in milliseconds since epoch.
     * 
    */
    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Last name of the developer.
     * 
    */
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Name of the Apigee organization in which the developer resides.
     * 
    */
    public String getOrganizationName() {
        return this.organizationName;
    }
    /**
     * Status of the developer. Valid values are `active` and `inactive`.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * User name of the developer. Not used by Apigee hybrid.
     * 
    */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeveloperResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessType;
        private String appFamily;
        private List<String> apps;
        private List<GoogleCloudApigeeV1AttributeResponse> attributes;
        private List<String> companies;
        private String createdAt;
        private String developerId;
        private String email;
        private String firstName;
        private String lastModifiedAt;
        private String lastName;
        private String organizationName;
        private String status;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeveloperResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessType = defaults.accessType;
    	      this.appFamily = defaults.appFamily;
    	      this.apps = defaults.apps;
    	      this.attributes = defaults.attributes;
    	      this.companies = defaults.companies;
    	      this.createdAt = defaults.createdAt;
    	      this.developerId = defaults.developerId;
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastName = defaults.lastName;
    	      this.organizationName = defaults.organizationName;
    	      this.status = defaults.status;
    	      this.userName = defaults.userName;
        }

        public Builder accessType(String accessType) {
            this.accessType = Objects.requireNonNull(accessType);
            return this;
        }
        public Builder appFamily(String appFamily) {
            this.appFamily = Objects.requireNonNull(appFamily);
            return this;
        }
        public Builder apps(List<String> apps) {
            this.apps = Objects.requireNonNull(apps);
            return this;
        }
        public Builder apps(String... apps) {
            return apps(List.of(apps));
        }
        public Builder attributes(List<GoogleCloudApigeeV1AttributeResponse> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder attributes(GoogleCloudApigeeV1AttributeResponse... attributes) {
            return attributes(List.of(attributes));
        }
        public Builder companies(List<String> companies) {
            this.companies = Objects.requireNonNull(companies);
            return this;
        }
        public Builder companies(String... companies) {
            return companies(List.of(companies));
        }
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder developerId(String developerId) {
            this.developerId = Objects.requireNonNull(developerId);
            return this;
        }
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        public Builder lastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        public Builder organizationName(String organizationName) {
            this.organizationName = Objects.requireNonNull(organizationName);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public GetDeveloperResult build() {
            return new GetDeveloperResult(accessType, appFamily, apps, attributes, companies, createdAt, developerId, email, firstName, lastModifiedAt, lastName, organizationName, status, userName);
        }
    }
}
