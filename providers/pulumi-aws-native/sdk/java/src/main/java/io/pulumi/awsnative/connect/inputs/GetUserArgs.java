// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetUserArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserArgs Empty = new GetUserArgs();

    /**
     * The Amazon Resource Name (ARN) for the user.
     * 
     */
    @InputImport(name="userArn", required=true)
      private final String userArn;

    public String getUserArn() {
        return this.userArn;
    }

    public GetUserArgs(String userArn) {
        this.userArn = Objects.requireNonNull(userArn, "expected parameter 'userArn' to be non-null");
    }

    private GetUserArgs() {
        this.userArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String userArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userArn = defaults.userArn;
        }

        public Builder setUserArn(String userArn) {
            this.userArn = Objects.requireNonNull(userArn);
            return this;
        }
        public GetUserArgs build() {
            return new GetUserArgs(userArn);
        }
    }
}
