// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataIntegration;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * (Updatable) The OCID of the compartment containing the workspace.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the compartment containing the workspace.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) A user defined description for the workspace.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) A user defined description for the workspace.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) A user-friendly display name for the workspace. Does not have to be unique, and can be modified. Avoid entering confidential information.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly display name for the workspace. Does not have to be unique, and can be modified. Avoid entering confidential information.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The IP of the custom DNS.
     * 
     */
    @Import(name="dnsServerIp")
    private @Nullable Output<String> dnsServerIp;

    /**
     * @return The IP of the custom DNS.
     * 
     */
    public Optional<Output<String>> dnsServerIp() {
        return Optional.ofNullable(this.dnsServerIp);
    }

    /**
     * The DNS zone of the custom DNS to use to resolve names.
     * 
     */
    @Import(name="dnsServerZone")
    private @Nullable Output<String> dnsServerZone;

    /**
     * @return The DNS zone of the custom DNS to use to resolve names.
     * 
     */
    public Optional<Output<String>> dnsServerZone() {
        return Optional.ofNullable(this.dnsServerZone);
    }

    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    @Import(name="isForceOperation")
    private @Nullable Output<Boolean> isForceOperation;

    public Optional<Output<Boolean>> isForceOperation() {
        return Optional.ofNullable(this.isForceOperation);
    }

    /**
     * Specifies whether the private network connection is enabled or disabled.
     * 
     */
    @Import(name="isPrivateNetworkEnabled")
    private @Nullable Output<Boolean> isPrivateNetworkEnabled;

    /**
     * @return Specifies whether the private network connection is enabled or disabled.
     * 
     */
    public Optional<Output<Boolean>> isPrivateNetworkEnabled() {
        return Optional.ofNullable(this.isPrivateNetworkEnabled);
    }

    @Import(name="quiesceTimeout")
    private @Nullable Output<Integer> quiesceTimeout;

    public Optional<Output<Integer>> quiesceTimeout() {
        return Optional.ofNullable(this.quiesceTimeout);
    }

    /**
     * The OCID of the subnet for customer connected databases.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The OCID of the subnet for customer connected databases.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * The OCID of the VCN the subnet is in.
     * 
     */
    @Import(name="vcnId")
    private @Nullable Output<String> vcnId;

    /**
     * @return The OCID of the VCN the subnet is in.
     * 
     */
    public Optional<Output<String>> vcnId() {
        return Optional.ofNullable(this.vcnId);
    }

    private WorkspaceArgs() {}

    private WorkspaceArgs(WorkspaceArgs $) {
        this.compartmentId = $.compartmentId;
        this.definedTags = $.definedTags;
        this.description = $.description;
        this.displayName = $.displayName;
        this.dnsServerIp = $.dnsServerIp;
        this.dnsServerZone = $.dnsServerZone;
        this.freeformTags = $.freeformTags;
        this.isForceOperation = $.isForceOperation;
        this.isPrivateNetworkEnabled = $.isPrivateNetworkEnabled;
        this.quiesceTimeout = $.quiesceTimeout;
        this.subnetId = $.subnetId;
        this.vcnId = $.vcnId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceArgs $;

        public Builder() {
            $ = new WorkspaceArgs();
        }

        public Builder(WorkspaceArgs defaults) {
            $ = new WorkspaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) The OCID of the compartment containing the workspace.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The OCID of the compartment containing the workspace.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param description (Updatable) A user defined description for the workspace.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) A user defined description for the workspace.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName (Updatable) A user-friendly display name for the workspace. Does not have to be unique, and can be modified. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) A user-friendly display name for the workspace. Does not have to be unique, and can be modified. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param dnsServerIp The IP of the custom DNS.
         * 
         * @return builder
         * 
         */
        public Builder dnsServerIp(@Nullable Output<String> dnsServerIp) {
            $.dnsServerIp = dnsServerIp;
            return this;
        }

        /**
         * @param dnsServerIp The IP of the custom DNS.
         * 
         * @return builder
         * 
         */
        public Builder dnsServerIp(String dnsServerIp) {
            return dnsServerIp(Output.of(dnsServerIp));
        }

        /**
         * @param dnsServerZone The DNS zone of the custom DNS to use to resolve names.
         * 
         * @return builder
         * 
         */
        public Builder dnsServerZone(@Nullable Output<String> dnsServerZone) {
            $.dnsServerZone = dnsServerZone;
            return this;
        }

        /**
         * @param dnsServerZone The DNS zone of the custom DNS to use to resolve names.
         * 
         * @return builder
         * 
         */
        public Builder dnsServerZone(String dnsServerZone) {
            return dnsServerZone(Output.of(dnsServerZone));
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        public Builder isForceOperation(@Nullable Output<Boolean> isForceOperation) {
            $.isForceOperation = isForceOperation;
            return this;
        }

        public Builder isForceOperation(Boolean isForceOperation) {
            return isForceOperation(Output.of(isForceOperation));
        }

        /**
         * @param isPrivateNetworkEnabled Specifies whether the private network connection is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder isPrivateNetworkEnabled(@Nullable Output<Boolean> isPrivateNetworkEnabled) {
            $.isPrivateNetworkEnabled = isPrivateNetworkEnabled;
            return this;
        }

        /**
         * @param isPrivateNetworkEnabled Specifies whether the private network connection is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder isPrivateNetworkEnabled(Boolean isPrivateNetworkEnabled) {
            return isPrivateNetworkEnabled(Output.of(isPrivateNetworkEnabled));
        }

        public Builder quiesceTimeout(@Nullable Output<Integer> quiesceTimeout) {
            $.quiesceTimeout = quiesceTimeout;
            return this;
        }

        public Builder quiesceTimeout(Integer quiesceTimeout) {
            return quiesceTimeout(Output.of(quiesceTimeout));
        }

        /**
         * @param subnetId The OCID of the subnet for customer connected databases.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The OCID of the subnet for customer connected databases.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param vcnId The OCID of the VCN the subnet is in.
         * 
         * @return builder
         * 
         */
        public Builder vcnId(@Nullable Output<String> vcnId) {
            $.vcnId = vcnId;
            return this;
        }

        /**
         * @param vcnId The OCID of the VCN the subnet is in.
         * 
         * @return builder
         * 
         */
        public Builder vcnId(String vcnId) {
            return vcnId(Output.of(vcnId));
        }

        public WorkspaceArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}
