// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The user object receiver value.
 * 
 */
public final class UserObjectReceiverValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserObjectReceiverValueArgs Empty = new UserObjectReceiverValueArgs();

    /**
     * user object ids.
     * 
     */
    @Import(name="userObjectIds")
      private final @Nullable Output<List<String>> userObjectIds;

    public Output<List<String>> getUserObjectIds() {
        return this.userObjectIds == null ? Codegen.empty() : this.userObjectIds;
    }

    public UserObjectReceiverValueArgs(@Nullable Output<List<String>> userObjectIds) {
        this.userObjectIds = userObjectIds;
    }

    private UserObjectReceiverValueArgs() {
        this.userObjectIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserObjectReceiverValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> userObjectIds;

        public Builder() {
    	      // Empty
        }

        public Builder(UserObjectReceiverValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userObjectIds = defaults.userObjectIds;
        }

        public Builder userObjectIds(@Nullable Output<List<String>> userObjectIds) {
            this.userObjectIds = userObjectIds;
            return this;
        }
        public Builder userObjectIds(@Nullable List<String> userObjectIds) {
            this.userObjectIds = Codegen.ofNullable(userObjectIds);
            return this;
        }
        public Builder userObjectIds(String... userObjectIds) {
            return userObjectIds(List.of(userObjectIds));
        }        public UserObjectReceiverValueArgs build() {
            return new UserObjectReceiverValueArgs(userObjectIds);
        }
    }
}
