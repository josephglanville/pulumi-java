// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains information for a user identity in an access policy.
 * 
 */
public final class AccessPolicyUserArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPolicyUserArgs Empty = new AccessPolicyUserArgs();

    /**
     * The AWS SSO ID of the user.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    public AccessPolicyUserArgs(@Nullable Output<String> id) {
        this.id = id;
    }

    private AccessPolicyUserArgs() {
        this.id = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public AccessPolicyUserArgs build() {
            return new AccessPolicyUserArgs(id);
        }
    }
}
