// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectServiceAccountResult {
    /**
     * The email address of the service account. This value is often used to refer to the service account
     * in order to grant IAM permissions.
     * 
     */
    private final String emailAddress;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String project;
    private final @Nullable String userProject;

    @CustomType.Constructor
    private GetProjectServiceAccountResult(
        @CustomType.Parameter("emailAddress") String emailAddress,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("userProject") @Nullable String userProject) {
        this.emailAddress = emailAddress;
        this.id = id;
        this.project = project;
        this.userProject = userProject;
    }

    /**
     * The email address of the service account. This value is often used to refer to the service account
     * in order to grant IAM permissions.
     * 
    */
    public String getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getProject() {
        return this.project;
    }
    public Optional<String> getUserProject() {
        return Optional.ofNullable(this.userProject);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectServiceAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String emailAddress;
        private String id;
        private String project;
        private @Nullable String userProject;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectServiceAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.id = defaults.id;
    	      this.project = defaults.project;
    	      this.userProject = defaults.userProject;
        }

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder userProject(@Nullable String userProject) {
            this.userProject = userProject;
            return this;
        }        public GetProjectServiceAccountResult build() {
            return new GetProjectServiceAccountResult(emailAddress, id, project, userProject);
        }
    }
}
