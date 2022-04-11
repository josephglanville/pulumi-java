// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.PolicyStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The retention policy for a container registry.
 * 
 */
public final class RetentionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RetentionPolicyArgs Empty = new RetentionPolicyArgs();

    /**
     * The number of days to retain an untagged manifest after which it gets purged.
     * 
     */
    @Import(name="days")
      private final @Nullable Output<Integer> days;

    public Output<Integer> getDays() {
        return this.days == null ? Codegen.empty() : this.days;
    }

    /**
     * The value that indicates whether the policy is enabled or not.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<Either<String,PolicyStatus>> status;

    public Output<Either<String,PolicyStatus>> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public RetentionPolicyArgs(
        @Nullable Output<Integer> days,
        @Nullable Output<Either<String,PolicyStatus>> status) {
        this.days = days == null ? Codegen.ofNullable(7) : days;
        this.status = status == null ? Output.ofLeft("disabled") : status;
    }

    private RetentionPolicyArgs() {
        this.days = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> days;
        private @Nullable Output<Either<String,PolicyStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(RetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.status = defaults.status;
        }

        public Builder days(@Nullable Output<Integer> days) {
            this.days = days;
            return this;
        }
        public Builder days(@Nullable Integer days) {
            this.days = Codegen.ofNullable(days);
            return this;
        }
        public Builder status(@Nullable Output<Either<String,PolicyStatus>> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable Either<String,PolicyStatus> status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public RetentionPolicyArgs build() {
            return new RetentionPolicyArgs(days, status);
        }
    }
}
