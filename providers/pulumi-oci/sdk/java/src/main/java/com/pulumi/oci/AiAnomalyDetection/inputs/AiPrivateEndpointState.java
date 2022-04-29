// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.AiAnomalyDetection.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AiPrivateEndpointState extends com.pulumi.resources.ResourceArgs {

    public static final AiPrivateEndpointState Empty = new AiPrivateEndpointState();

    /**
     * The list of dataAssets using the private reverse connection endpoint.
     * 
     */
    @Import(name="attachedDataAssets")
    private @Nullable Output<List<String>> attachedDataAssets;

    /**
     * @return The list of dataAssets using the private reverse connection endpoint.
     * 
     */
    public Optional<Output<List<String>>> attachedDataAssets() {
        return Optional.ofNullable(this.attachedDataAssets);
    }

    /**
     * (Updatable) Compartment identifier.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) Compartment identifier.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) Display name of the private endpoint resource being created.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) Display name of the private endpoint resource being created.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (Updatable) List of DNS zones to be used by the data assets. Example: custpvtsubnet.oraclevcn.com for data asset: db.custpvtsubnet.oraclevcn.com
     * 
     */
    @Import(name="dnsZones")
    private @Nullable Output<List<String>> dnsZones;

    /**
     * @return (Updatable) List of DNS zones to be used by the data assets. Example: custpvtsubnet.oraclevcn.com for data asset: db.custpvtsubnet.oraclevcn.com
     * 
     */
    public Optional<Output<List<String>>> dnsZones() {
        return Optional.ofNullable(this.dnsZones);
    }

    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in &#39;Failed&#39; state.
     * 
     */
    @Import(name="lifecycleDetails")
    private @Nullable Output<String> lifecycleDetails;

    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in &#39;Failed&#39; state.
     * 
     */
    public Optional<Output<String>> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }

    /**
     * The current state of the private endpoint resource.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the private endpoint resource.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The OCID of subnet to which the reverse connection is to be created.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The OCID of subnet to which the reverse connection is to be created.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    @Import(name="systemTags")
    private @Nullable Output<Map<String,Object>> systemTags;

    /**
     * @return Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> systemTags() {
        return Optional.ofNullable(this.systemTags);
    }

    /**
     * The time the private endpoint was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The time the private endpoint was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * The time the private endpoint was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    @Import(name="timeUpdated")
    private @Nullable Output<String> timeUpdated;

    /**
     * @return The time the private endpoint was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    public Optional<Output<String>> timeUpdated() {
        return Optional.ofNullable(this.timeUpdated);
    }

    private AiPrivateEndpointState() {}

    private AiPrivateEndpointState(AiPrivateEndpointState $) {
        this.attachedDataAssets = $.attachedDataAssets;
        this.compartmentId = $.compartmentId;
        this.definedTags = $.definedTags;
        this.displayName = $.displayName;
        this.dnsZones = $.dnsZones;
        this.freeformTags = $.freeformTags;
        this.lifecycleDetails = $.lifecycleDetails;
        this.state = $.state;
        this.subnetId = $.subnetId;
        this.systemTags = $.systemTags;
        this.timeCreated = $.timeCreated;
        this.timeUpdated = $.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiPrivateEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiPrivateEndpointState $;

        public Builder() {
            $ = new AiPrivateEndpointState();
        }

        public Builder(AiPrivateEndpointState defaults) {
            $ = new AiPrivateEndpointState(Objects.requireNonNull(defaults));
        }

        /**
         * @param attachedDataAssets The list of dataAssets using the private reverse connection endpoint.
         * 
         * @return builder
         * 
         */
        public Builder attachedDataAssets(@Nullable Output<List<String>> attachedDataAssets) {
            $.attachedDataAssets = attachedDataAssets;
            return this;
        }

        /**
         * @param attachedDataAssets The list of dataAssets using the private reverse connection endpoint.
         * 
         * @return builder
         * 
         */
        public Builder attachedDataAssets(List<String> attachedDataAssets) {
            return attachedDataAssets(Output.of(attachedDataAssets));
        }

        /**
         * @param attachedDataAssets The list of dataAssets using the private reverse connection endpoint.
         * 
         * @return builder
         * 
         */
        public Builder attachedDataAssets(String... attachedDataAssets) {
            return attachedDataAssets(List.of(attachedDataAssets));
        }

        /**
         * @param compartmentId (Updatable) Compartment identifier.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) Compartment identifier.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param displayName (Updatable) Display name of the private endpoint resource being created.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) Display name of the private endpoint resource being created.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param dnsZones (Updatable) List of DNS zones to be used by the data assets. Example: custpvtsubnet.oraclevcn.com for data asset: db.custpvtsubnet.oraclevcn.com
         * 
         * @return builder
         * 
         */
        public Builder dnsZones(@Nullable Output<List<String>> dnsZones) {
            $.dnsZones = dnsZones;
            return this;
        }

        /**
         * @param dnsZones (Updatable) List of DNS zones to be used by the data assets. Example: custpvtsubnet.oraclevcn.com for data asset: db.custpvtsubnet.oraclevcn.com
         * 
         * @return builder
         * 
         */
        public Builder dnsZones(List<String> dnsZones) {
            return dnsZones(Output.of(dnsZones));
        }

        /**
         * @param dnsZones (Updatable) List of DNS zones to be used by the data assets. Example: custpvtsubnet.oraclevcn.com for data asset: db.custpvtsubnet.oraclevcn.com
         * 
         * @return builder
         * 
         */
        public Builder dnsZones(String... dnsZones) {
            return dnsZones(List.of(dnsZones));
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param lifecycleDetails A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in &#39;Failed&#39; state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(@Nullable Output<String> lifecycleDetails) {
            $.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * @param lifecycleDetails A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in &#39;Failed&#39; state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            return lifecycleDetails(Output.of(lifecycleDetails));
        }

        /**
         * @param state The current state of the private endpoint resource.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the private endpoint resource.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param subnetId The OCID of subnet to which the reverse connection is to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The OCID of subnet to which the reverse connection is to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param systemTags Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder systemTags(@Nullable Output<Map<String,Object>> systemTags) {
            $.systemTags = systemTags;
            return this;
        }

        /**
         * @param systemTags Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder systemTags(Map<String,Object> systemTags) {
            return systemTags(Output.of(systemTags));
        }

        /**
         * @param timeCreated The time the private endpoint was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The time the private endpoint was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param timeUpdated The time the private endpoint was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(@Nullable Output<String> timeUpdated) {
            $.timeUpdated = timeUpdated;
            return this;
        }

        /**
         * @param timeUpdated The time the private endpoint was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(String timeUpdated) {
            return timeUpdated(Output.of(timeUpdated));
        }

        public AiPrivateEndpointState build() {
            return $;
        }
    }

}
