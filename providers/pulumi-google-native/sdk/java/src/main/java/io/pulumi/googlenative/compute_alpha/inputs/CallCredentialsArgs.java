// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.CallCredentialsCallCredentialType;
import io.pulumi.googlenative.compute_alpha.inputs.MetadataCredentialsFromPluginArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [Deprecated] gRPC call credentials to access the SDS server. gRPC call credentials to access the SDS server.
 * 
 */
public final class CallCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CallCredentialsArgs Empty = new CallCredentialsArgs();

    /**
     * The type of call credentials to use for GRPC requests to the SDS server. This field can be set to one of the following: - GCE_VM: The local GCE VM service account credentials are used to access the SDS server. - FROM_PLUGIN: Custom authenticator credentials are used to access the SDS server.
     * 
     */
    @Import(name="callCredentialType")
      private final @Nullable Output<CallCredentialsCallCredentialType> callCredentialType;

    public Output<CallCredentialsCallCredentialType> getCallCredentialType() {
        return this.callCredentialType == null ? Codegen.empty() : this.callCredentialType;
    }

    /**
     * Custom authenticator credentials. Valid if callCredentialType is FROM_PLUGIN.
     * 
     */
    @Import(name="fromPlugin")
      private final @Nullable Output<MetadataCredentialsFromPluginArgs> fromPlugin;

    public Output<MetadataCredentialsFromPluginArgs> getFromPlugin() {
        return this.fromPlugin == null ? Codegen.empty() : this.fromPlugin;
    }

    public CallCredentialsArgs(
        @Nullable Output<CallCredentialsCallCredentialType> callCredentialType,
        @Nullable Output<MetadataCredentialsFromPluginArgs> fromPlugin) {
        this.callCredentialType = callCredentialType;
        this.fromPlugin = fromPlugin;
    }

    private CallCredentialsArgs() {
        this.callCredentialType = Codegen.empty();
        this.fromPlugin = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CallCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CallCredentialsCallCredentialType> callCredentialType;
        private @Nullable Output<MetadataCredentialsFromPluginArgs> fromPlugin;

        public Builder() {
    	      // Empty
        }

        public Builder(CallCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callCredentialType = defaults.callCredentialType;
    	      this.fromPlugin = defaults.fromPlugin;
        }

        public Builder callCredentialType(@Nullable Output<CallCredentialsCallCredentialType> callCredentialType) {
            this.callCredentialType = callCredentialType;
            return this;
        }
        public Builder callCredentialType(@Nullable CallCredentialsCallCredentialType callCredentialType) {
            this.callCredentialType = Codegen.ofNullable(callCredentialType);
            return this;
        }
        public Builder fromPlugin(@Nullable Output<MetadataCredentialsFromPluginArgs> fromPlugin) {
            this.fromPlugin = fromPlugin;
            return this;
        }
        public Builder fromPlugin(@Nullable MetadataCredentialsFromPluginArgs fromPlugin) {
            this.fromPlugin = Codegen.ofNullable(fromPlugin);
            return this;
        }        public CallCredentialsArgs build() {
            return new CallCredentialsArgs(callCredentialType, fromPlugin);
        }
    }
}
