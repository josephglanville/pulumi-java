// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.GoldenGate.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDeploymentUpgradeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeploymentUpgradeArgs Empty = new GetDeploymentUpgradeArgs();

    /**
     * A unique Deployment Upgrade identifier.
     * 
     */
    @Import(name="deploymentUpgradeId", required=true)
    private String deploymentUpgradeId;

    /**
     * @return A unique Deployment Upgrade identifier.
     * 
     */
    public String deploymentUpgradeId() {
        return this.deploymentUpgradeId;
    }

    private GetDeploymentUpgradeArgs() {}

    private GetDeploymentUpgradeArgs(GetDeploymentUpgradeArgs $) {
        this.deploymentUpgradeId = $.deploymentUpgradeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeploymentUpgradeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeploymentUpgradeArgs $;

        public Builder() {
            $ = new GetDeploymentUpgradeArgs();
        }

        public Builder(GetDeploymentUpgradeArgs defaults) {
            $ = new GetDeploymentUpgradeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentUpgradeId A unique Deployment Upgrade identifier.
         * 
         * @return builder
         * 
         */
        public Builder deploymentUpgradeId(String deploymentUpgradeId) {
            $.deploymentUpgradeId = deploymentUpgradeId;
            return this;
        }

        public GetDeploymentUpgradeArgs build() {
            $.deploymentUpgradeId = Objects.requireNonNull($.deploymentUpgradeId, "expected parameter 'deploymentUpgradeId' to be non-null");
            return $;
        }
    }

}
