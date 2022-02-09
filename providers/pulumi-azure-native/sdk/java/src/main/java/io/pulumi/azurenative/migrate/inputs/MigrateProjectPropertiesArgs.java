// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.enums.ProvisioningState;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MigrateProjectPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrateProjectPropertiesArgs Empty = new MigrateProjectPropertiesArgs();

    @InputImport(name="provisioningState")
    private final @Nullable Input<Either<String,ProvisioningState>> provisioningState;

    public Input<Either<String,ProvisioningState>> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    @InputImport(name="registeredTools")
    private final @Nullable Input<List<String>> registeredTools;

    public Input<List<String>> getRegisteredTools() {
        return this.registeredTools == null ? Input.empty() : this.registeredTools;
    }

    public MigrateProjectPropertiesArgs(
        @Nullable Input<Either<String,ProvisioningState>> provisioningState,
        @Nullable Input<List<String>> registeredTools) {
        this.provisioningState = provisioningState;
        this.registeredTools = registeredTools;
    }

    private MigrateProjectPropertiesArgs() {
        this.provisioningState = Input.empty();
        this.registeredTools = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateProjectPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ProvisioningState>> provisioningState;
        private @Nullable Input<List<String>> registeredTools;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateProjectPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
    	      this.registeredTools = defaults.registeredTools;
        }

        public Builder setProvisioningState(@Nullable Input<Either<String,ProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable Either<String,ProvisioningState> provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
            return this;
        }

        public Builder setRegisteredTools(@Nullable Input<List<String>> registeredTools) {
            this.registeredTools = registeredTools;
            return this;
        }

        public Builder setRegisteredTools(@Nullable List<String> registeredTools) {
            this.registeredTools = Input.ofNullable(registeredTools);
            return this;
        }

        public MigrateProjectPropertiesArgs build() {
            return new MigrateProjectPropertiesArgs(provisioningState, registeredTools);
        }
    }
}
