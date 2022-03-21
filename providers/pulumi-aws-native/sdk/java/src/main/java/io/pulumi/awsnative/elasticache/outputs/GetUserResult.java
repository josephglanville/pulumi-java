// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticache.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUserResult {
    /**
     * The Amazon Resource Name (ARN) of the user account.
     * 
     */
    private final @Nullable String arn;
    /**
     * Indicates the user status. Can be "active", "modifying" or "deleting".
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private GetUserResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("status") @Nullable String status) {
        this.arn = arn;
        this.status = status;
    }

    /**
     * The Amazon Resource Name (ARN) of the user account.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Indicates the user status. Can be "active", "modifying" or "deleting".
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.status = defaults.status;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetUserResult build() {
            return new GetUserResult(arn, status);
        }
    }
}
