// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FirewallPolicyIntrusionDetectionStateType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyIntrusionDetectionSignatureSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyIntrusionDetectionSignatureSpecificationArgs Empty = new FirewallPolicyIntrusionDetectionSignatureSpecificationArgs();

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="mode")
    private final @Nullable Input<Either<String,FirewallPolicyIntrusionDetectionStateType>> mode;

    public Input<Either<String,FirewallPolicyIntrusionDetectionStateType>> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    public FirewallPolicyIntrusionDetectionSignatureSpecificationArgs(
        @Nullable Input<String> id,
        @Nullable Input<Either<String,FirewallPolicyIntrusionDetectionStateType>> mode) {
        this.id = id;
        this.mode = mode;
    }

    private FirewallPolicyIntrusionDetectionSignatureSpecificationArgs() {
        this.id = Input.empty();
        this.mode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyIntrusionDetectionSignatureSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<Either<String,FirewallPolicyIntrusionDetectionStateType>> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyIntrusionDetectionSignatureSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.mode = defaults.mode;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setMode(@Nullable Input<Either<String,FirewallPolicyIntrusionDetectionStateType>> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable Either<String,FirewallPolicyIntrusionDetectionStateType> mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public FirewallPolicyIntrusionDetectionSignatureSpecificationArgs build() {
            return new FirewallPolicyIntrusionDetectionSignatureSpecificationArgs(id, mode);
        }
    }
}
