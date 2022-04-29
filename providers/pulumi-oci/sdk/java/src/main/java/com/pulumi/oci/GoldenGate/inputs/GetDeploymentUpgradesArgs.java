// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.GoldenGate.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.GoldenGate.inputs.GetDeploymentUpgradesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeploymentUpgradesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeploymentUpgradesArgs Empty = new GetDeploymentUpgradesArgs();

    /**
     * The ID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The ID of the compartment in which to list resources.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * The ID of the deployment in which to list resources.
     * 
     */
    @Import(name="deploymentId")
    private @Nullable String deploymentId;

    /**
     * @return The ID of the deployment in which to list resources.
     * 
     */
    public Optional<String> deploymentId() {
        return Optional.ofNullable(this.deploymentId);
    }

    /**
     * A filter to return only the resources that match the entire &#39;displayName&#39; given.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only the resources that match the entire &#39;displayName&#39; given.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetDeploymentUpgradesFilter> filters;

    public Optional<List<GetDeploymentUpgradesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only the resources that match the &#39;lifecycleState&#39; given.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only the resources that match the &#39;lifecycleState&#39; given.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetDeploymentUpgradesArgs() {}

    private GetDeploymentUpgradesArgs(GetDeploymentUpgradesArgs $) {
        this.compartmentId = $.compartmentId;
        this.deploymentId = $.deploymentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeploymentUpgradesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeploymentUpgradesArgs $;

        public Builder() {
            $ = new GetDeploymentUpgradesArgs();
        }

        public Builder(GetDeploymentUpgradesArgs defaults) {
            $ = new GetDeploymentUpgradesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param deploymentId The ID of the deployment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(@Nullable String deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        /**
         * @param displayName A filter to return only the resources that match the entire &#39;displayName&#39; given.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetDeploymentUpgradesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDeploymentUpgradesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state A filter to return only the resources that match the &#39;lifecycleState&#39; given.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetDeploymentUpgradesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
