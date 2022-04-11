// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details of the service principal.
 * 
 */
public final class ServicePrincipalPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePrincipalPropertiesArgs Empty = new ServicePrincipalPropertiesArgs();

    /**
     * Application ID of service principal.
     * 
     */
    @Import(name="applicationId")
      private final @Nullable Output<String> applicationId;

    public Output<String> getApplicationId() {
        return this.applicationId == null ? Codegen.empty() : this.applicationId;
    }

    /**
     * A secret string that the application uses to prove its identity, also can be referred to as application password (write only).
     * 
     */
    @Import(name="secret")
      private final @Nullable Output<String> secret;

    public Output<String> getSecret() {
        return this.secret == null ? Codegen.empty() : this.secret;
    }

    public ServicePrincipalPropertiesArgs(
        @Nullable Output<String> applicationId,
        @Nullable Output<String> secret) {
        this.applicationId = applicationId;
        this.secret = secret;
    }

    private ServicePrincipalPropertiesArgs() {
        this.applicationId = Codegen.empty();
        this.secret = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationId;
        private @Nullable Output<String> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.secret = defaults.secret;
        }

        public Builder applicationId(@Nullable Output<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = Codegen.ofNullable(applicationId);
            return this;
        }
        public Builder secret(@Nullable Output<String> secret) {
            this.secret = secret;
            return this;
        }
        public Builder secret(@Nullable String secret) {
            this.secret = Codegen.ofNullable(secret);
            return this;
        }        public ServicePrincipalPropertiesArgs build() {
            return new ServicePrincipalPropertiesArgs(applicationId, secret);
        }
    }
}
