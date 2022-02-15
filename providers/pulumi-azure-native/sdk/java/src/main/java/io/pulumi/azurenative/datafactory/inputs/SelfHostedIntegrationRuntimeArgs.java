// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.LinkedIntegrationRuntimeKeyAuthorizationArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedIntegrationRuntimeRbacAuthorizationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SelfHostedIntegrationRuntimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelfHostedIntegrationRuntimeArgs Empty = new SelfHostedIntegrationRuntimeArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="linkedInfo")
    private final @Nullable Input<Either<LinkedIntegrationRuntimeKeyAuthorizationArgs,LinkedIntegrationRuntimeRbacAuthorizationArgs>> linkedInfo;

    public Input<Either<LinkedIntegrationRuntimeKeyAuthorizationArgs,LinkedIntegrationRuntimeRbacAuthorizationArgs>> getLinkedInfo() {
        return this.linkedInfo == null ? Input.empty() : this.linkedInfo;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public SelfHostedIntegrationRuntimeArgs(
        @Nullable Input<String> description,
        @Nullable Input<Either<LinkedIntegrationRuntimeKeyAuthorizationArgs,LinkedIntegrationRuntimeRbacAuthorizationArgs>> linkedInfo,
        Input<String> type) {
        this.description = description;
        this.linkedInfo = linkedInfo;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SelfHostedIntegrationRuntimeArgs() {
        this.description = Input.empty();
        this.linkedInfo = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfHostedIntegrationRuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Either<LinkedIntegrationRuntimeKeyAuthorizationArgs,LinkedIntegrationRuntimeRbacAuthorizationArgs>> linkedInfo;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SelfHostedIntegrationRuntimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.linkedInfo = defaults.linkedInfo;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setLinkedInfo(@Nullable Input<Either<LinkedIntegrationRuntimeKeyAuthorizationArgs,LinkedIntegrationRuntimeRbacAuthorizationArgs>> linkedInfo) {
            this.linkedInfo = linkedInfo;
            return this;
        }

        public Builder setLinkedInfo(@Nullable Either<LinkedIntegrationRuntimeKeyAuthorizationArgs,LinkedIntegrationRuntimeRbacAuthorizationArgs> linkedInfo) {
            this.linkedInfo = Input.ofNullable(linkedInfo);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public SelfHostedIntegrationRuntimeArgs build() {
            return new SelfHostedIntegrationRuntimeArgs(description, linkedInfo, type);
        }
    }
}