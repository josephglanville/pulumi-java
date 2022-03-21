// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.inputs.ClientGroupInfoResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The kafka rest proxy configuration which contains AAD security group information.
 * 
 */
public final class KafkaRestPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KafkaRestPropertiesResponse Empty = new KafkaRestPropertiesResponse();

    /**
     * The information of AAD security group.
     * 
     */
    @Import(name="clientGroupInfo")
      private final @Nullable ClientGroupInfoResponse clientGroupInfo;

    public Optional<ClientGroupInfoResponse> getClientGroupInfo() {
        return this.clientGroupInfo == null ? Optional.empty() : Optional.ofNullable(this.clientGroupInfo);
    }

    /**
     * The configurations that need to be overriden.
     * 
     */
    @Import(name="configurationOverride")
      private final @Nullable Map<String,String> configurationOverride;

    public Map<String,String> getConfigurationOverride() {
        return this.configurationOverride == null ? Map.of() : this.configurationOverride;
    }

    public KafkaRestPropertiesResponse(
        @Nullable ClientGroupInfoResponse clientGroupInfo,
        @Nullable Map<String,String> configurationOverride) {
        this.clientGroupInfo = clientGroupInfo;
        this.configurationOverride = configurationOverride;
    }

    private KafkaRestPropertiesResponse() {
        this.clientGroupInfo = null;
        this.configurationOverride = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaRestPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClientGroupInfoResponse clientGroupInfo;
        private @Nullable Map<String,String> configurationOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(KafkaRestPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientGroupInfo = defaults.clientGroupInfo;
    	      this.configurationOverride = defaults.configurationOverride;
        }

        public Builder clientGroupInfo(@Nullable ClientGroupInfoResponse clientGroupInfo) {
            this.clientGroupInfo = clientGroupInfo;
            return this;
        }
        public Builder configurationOverride(@Nullable Map<String,String> configurationOverride) {
            this.configurationOverride = configurationOverride;
            return this;
        }        public KafkaRestPropertiesResponse build() {
            return new KafkaRestPropertiesResponse(clientGroupInfo, configurationOverride);
        }
    }
}
