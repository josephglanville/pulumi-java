// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1AttributeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeveloperArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeveloperArgs Empty = new DeveloperArgs();

    /**
     * Access type.
     * 
     */
    @Import(name="accessType")
      private final @Nullable Output<String> accessType;

    public Output<String> getAccessType() {
        return this.accessType == null ? Output.empty() : this.accessType;
    }

    /**
     * Developer app family.
     * 
     */
    @Import(name="appFamily")
      private final @Nullable Output<String> appFamily;

    public Output<String> getAppFamily() {
        return this.appFamily == null ? Output.empty() : this.appFamily;
    }

    /**
     * List of apps associated with the developer.
     * 
     */
    @Import(name="apps")
      private final @Nullable Output<List<String>> apps;

    public Output<List<String>> getApps() {
        return this.apps == null ? Output.empty() : this.apps;
    }

    /**
     * Optional. Developer attributes (name/value pairs). The custom attribute limit is 18.
     * 
     */
    @Import(name="attributes")
      private final @Nullable Output<List<GoogleCloudApigeeV1AttributeArgs>> attributes;

    public Output<List<GoogleCloudApigeeV1AttributeArgs>> getAttributes() {
        return this.attributes == null ? Output.empty() : this.attributes;
    }

    /**
     * List of companies associated with the developer.
     * 
     */
    @Import(name="companies")
      private final @Nullable Output<List<String>> companies;

    public Output<List<String>> getCompanies() {
        return this.companies == null ? Output.empty() : this.companies;
    }

    /**
     * ID of the developer. **Note**: IDs are generated internally by Apigee and are not guaranteed to stay the same over time.
     * 
     */
    @Import(name="developerId")
      private final @Nullable Output<String> developerId;

    public Output<String> getDeveloperId() {
        return this.developerId == null ? Output.empty() : this.developerId;
    }

    /**
     * Email address of the developer. This value is used to uniquely identify the developer in Apigee hybrid. Note that the email address has to be in lowercase only.
     * 
     */
    @Import(name="email", required=true)
      private final Output<String> email;

    public Output<String> getEmail() {
        return this.email;
    }

    /**
     * First name of the developer.
     * 
     */
    @Import(name="firstName", required=true)
      private final Output<String> firstName;

    public Output<String> getFirstName() {
        return this.firstName;
    }

    /**
     * Last name of the developer.
     * 
     */
    @Import(name="lastName", required=true)
      private final Output<String> lastName;

    public Output<String> getLastName() {
        return this.lastName;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * User name of the developer. Not used by Apigee hybrid.
     * 
     */
    @Import(name="userName", required=true)
      private final Output<String> userName;

    public Output<String> getUserName() {
        return this.userName;
    }

    public DeveloperArgs(
        @Nullable Output<String> accessType,
        @Nullable Output<String> appFamily,
        @Nullable Output<List<String>> apps,
        @Nullable Output<List<GoogleCloudApigeeV1AttributeArgs>> attributes,
        @Nullable Output<List<String>> companies,
        @Nullable Output<String> developerId,
        Output<String> email,
        Output<String> firstName,
        Output<String> lastName,
        Output<String> organizationId,
        Output<String> userName) {
        this.accessType = accessType;
        this.appFamily = appFamily;
        this.apps = apps;
        this.attributes = attributes;
        this.companies = companies;
        this.developerId = developerId;
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.firstName = Objects.requireNonNull(firstName, "expected parameter 'firstName' to be non-null");
        this.lastName = Objects.requireNonNull(lastName, "expected parameter 'lastName' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private DeveloperArgs() {
        this.accessType = Output.empty();
        this.appFamily = Output.empty();
        this.apps = Output.empty();
        this.attributes = Output.empty();
        this.companies = Output.empty();
        this.developerId = Output.empty();
        this.email = Output.empty();
        this.firstName = Output.empty();
        this.lastName = Output.empty();
        this.organizationId = Output.empty();
        this.userName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeveloperArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessType;
        private @Nullable Output<String> appFamily;
        private @Nullable Output<List<String>> apps;
        private @Nullable Output<List<GoogleCloudApigeeV1AttributeArgs>> attributes;
        private @Nullable Output<List<String>> companies;
        private @Nullable Output<String> developerId;
        private Output<String> email;
        private Output<String> firstName;
        private Output<String> lastName;
        private Output<String> organizationId;
        private Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(DeveloperArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessType = defaults.accessType;
    	      this.appFamily = defaults.appFamily;
    	      this.apps = defaults.apps;
    	      this.attributes = defaults.attributes;
    	      this.companies = defaults.companies;
    	      this.developerId = defaults.developerId;
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.organizationId = defaults.organizationId;
    	      this.userName = defaults.userName;
        }

        public Builder accessType(@Nullable Output<String> accessType) {
            this.accessType = accessType;
            return this;
        }
        public Builder accessType(@Nullable String accessType) {
            this.accessType = Output.ofNullable(accessType);
            return this;
        }
        public Builder appFamily(@Nullable Output<String> appFamily) {
            this.appFamily = appFamily;
            return this;
        }
        public Builder appFamily(@Nullable String appFamily) {
            this.appFamily = Output.ofNullable(appFamily);
            return this;
        }
        public Builder apps(@Nullable Output<List<String>> apps) {
            this.apps = apps;
            return this;
        }
        public Builder apps(@Nullable List<String> apps) {
            this.apps = Output.ofNullable(apps);
            return this;
        }
        public Builder apps(String... apps) {
            return apps(List.of(apps));
        }
        public Builder attributes(@Nullable Output<List<GoogleCloudApigeeV1AttributeArgs>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder attributes(@Nullable List<GoogleCloudApigeeV1AttributeArgs> attributes) {
            this.attributes = Output.ofNullable(attributes);
            return this;
        }
        public Builder attributes(GoogleCloudApigeeV1AttributeArgs... attributes) {
            return attributes(List.of(attributes));
        }
        public Builder companies(@Nullable Output<List<String>> companies) {
            this.companies = companies;
            return this;
        }
        public Builder companies(@Nullable List<String> companies) {
            this.companies = Output.ofNullable(companies);
            return this;
        }
        public Builder companies(String... companies) {
            return companies(List.of(companies));
        }
        public Builder developerId(@Nullable Output<String> developerId) {
            this.developerId = developerId;
            return this;
        }
        public Builder developerId(@Nullable String developerId) {
            this.developerId = Output.ofNullable(developerId);
            return this;
        }
        public Builder email(Output<String> email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder email(String email) {
            this.email = Output.of(Objects.requireNonNull(email));
            return this;
        }
        public Builder firstName(Output<String> firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = Output.of(Objects.requireNonNull(firstName));
            return this;
        }
        public Builder lastName(Output<String> lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = Output.of(Objects.requireNonNull(lastName));
            return this;
        }
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public Builder userName(Output<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Output.of(Objects.requireNonNull(userName));
            return this;
        }        public DeveloperArgs build() {
            return new DeveloperArgs(accessType, appFamily, apps, attributes, companies, developerId, email, firstName, lastName, organizationId, userName);
        }
    }
}
