// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetUserProfileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserProfileArgs Empty = new GetUserProfileArgs();

    /**
     * The ID of the associated Domain.
     * 
     */
    @InputImport(name="domainId", required=true)
      private final String domainId;

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * A name for the UserProfile.
     * 
     */
    @InputImport(name="userProfileName", required=true)
      private final String userProfileName;

    public String getUserProfileName() {
        return this.userProfileName;
    }

    public GetUserProfileArgs(
        String domainId,
        String userProfileName) {
        this.domainId = Objects.requireNonNull(domainId, "expected parameter 'domainId' to be non-null");
        this.userProfileName = Objects.requireNonNull(userProfileName, "expected parameter 'userProfileName' to be non-null");
    }

    private GetUserProfileArgs() {
        this.domainId = null;
        this.userProfileName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainId;
        private String userProfileName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainId = defaults.domainId;
    	      this.userProfileName = defaults.userProfileName;
        }

        public Builder setDomainId(String domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }

        public Builder setUserProfileName(String userProfileName) {
            this.userProfileName = Objects.requireNonNull(userProfileName);
            return this;
        }
        public GetUserProfileArgs build() {
            return new GetUserProfileArgs(domainId, userProfileName);
        }
    }
}
