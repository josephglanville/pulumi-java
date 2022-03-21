// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetGameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector extends io.pulumi.resources.InvokeArgs {

    public static final GetGameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector Empty = new GetGameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector();

    @Import(name="realms", required=true)
      private final List<String> realms;

    public List<String> getRealms() {
        return this.realms;
    }

    public GetGameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector(List<String> realms) {
        this.realms = Objects.requireNonNull(realms, "expected parameter 'realms' to be non-null");
    }

    private GetGameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector() {
        this.realms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> realms;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.realms = defaults.realms;
        }

        public Builder realms(List<String> realms) {
            this.realms = Objects.requireNonNull(realms);
            return this;
        }
        public Builder realms(String... realms) {
            return realms(List.of(realms));
        }        public GetGameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector build() {
            return new GetGameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector(realms);
        }
    }
}
