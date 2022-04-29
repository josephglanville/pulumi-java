// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpsecArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpsecArgs Empty = new IpsecArgs();

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the IPSec connection.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the IPSec connection.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [Cpe](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Cpe/) object.
     * 
     */
    @Import(name="cpeId", required=true)
    private Output<String> cpeId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [Cpe](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Cpe/) object.
     * 
     */
    public Output<String> cpeId() {
        return this.cpeId;
    }

    /**
     * (Updatable) Your identifier for your CPE device. Can be either an IP address or a hostname (specifically, the fully qualified domain name (FQDN)). The type of identifier you provide here must correspond to the value for `cpeLocalIdentifierType`.
     * 
     */
    @Import(name="cpeLocalIdentifier")
    private @Nullable Output<String> cpeLocalIdentifier;

    /**
     * @return (Updatable) Your identifier for your CPE device. Can be either an IP address or a hostname (specifically, the fully qualified domain name (FQDN)). The type of identifier you provide here must correspond to the value for `cpeLocalIdentifierType`.
     * 
     */
    public Optional<Output<String>> cpeLocalIdentifier() {
        return Optional.ofNullable(this.cpeLocalIdentifier);
    }

    /**
     * (Updatable) The type of identifier for your CPE device. The value you provide here must correspond to the value for `cpeLocalIdentifier`.
     * 
     */
    @Import(name="cpeLocalIdentifierType")
    private @Nullable Output<String> cpeLocalIdentifierType;

    /**
     * @return (Updatable) The type of identifier for your CPE device. The value you provide here must correspond to the value for `cpeLocalIdentifier`.
     * 
     */
    public Optional<Output<String>> cpeLocalIdentifierType() {
        return Optional.ofNullable(this.cpeLocalIdentifierType);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     * 
     */
    @Import(name="drgId", required=true)
    private Output<String> drgId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     * 
     */
    public Output<String> drgId() {
        return this.drgId;
    }

    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * (Updatable) Static routes to the CPE. A static route&#39;s CIDR must not be a multicast address or class E address.
     * 
     */
    @Import(name="staticRoutes", required=true)
    private Output<List<String>> staticRoutes;

    /**
     * @return (Updatable) Static routes to the CPE. A static route&#39;s CIDR must not be a multicast address or class E address.
     * 
     */
    public Output<List<String>> staticRoutes() {
        return this.staticRoutes;
    }

    private IpsecArgs() {}

    private IpsecArgs(IpsecArgs $) {
        this.compartmentId = $.compartmentId;
        this.cpeId = $.cpeId;
        this.cpeLocalIdentifier = $.cpeLocalIdentifier;
        this.cpeLocalIdentifierType = $.cpeLocalIdentifierType;
        this.definedTags = $.definedTags;
        this.displayName = $.displayName;
        this.drgId = $.drgId;
        this.freeformTags = $.freeformTags;
        this.staticRoutes = $.staticRoutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpsecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpsecArgs $;

        public Builder() {
            $ = new IpsecArgs();
        }

        public Builder(IpsecArgs defaults) {
            $ = new IpsecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the IPSec connection.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the IPSec connection.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param cpeId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [Cpe](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Cpe/) object.
         * 
         * @return builder
         * 
         */
        public Builder cpeId(Output<String> cpeId) {
            $.cpeId = cpeId;
            return this;
        }

        /**
         * @param cpeId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [Cpe](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Cpe/) object.
         * 
         * @return builder
         * 
         */
        public Builder cpeId(String cpeId) {
            return cpeId(Output.of(cpeId));
        }

        /**
         * @param cpeLocalIdentifier (Updatable) Your identifier for your CPE device. Can be either an IP address or a hostname (specifically, the fully qualified domain name (FQDN)). The type of identifier you provide here must correspond to the value for `cpeLocalIdentifierType`.
         * 
         * @return builder
         * 
         */
        public Builder cpeLocalIdentifier(@Nullable Output<String> cpeLocalIdentifier) {
            $.cpeLocalIdentifier = cpeLocalIdentifier;
            return this;
        }

        /**
         * @param cpeLocalIdentifier (Updatable) Your identifier for your CPE device. Can be either an IP address or a hostname (specifically, the fully qualified domain name (FQDN)). The type of identifier you provide here must correspond to the value for `cpeLocalIdentifierType`.
         * 
         * @return builder
         * 
         */
        public Builder cpeLocalIdentifier(String cpeLocalIdentifier) {
            return cpeLocalIdentifier(Output.of(cpeLocalIdentifier));
        }

        /**
         * @param cpeLocalIdentifierType (Updatable) The type of identifier for your CPE device. The value you provide here must correspond to the value for `cpeLocalIdentifier`.
         * 
         * @return builder
         * 
         */
        public Builder cpeLocalIdentifierType(@Nullable Output<String> cpeLocalIdentifierType) {
            $.cpeLocalIdentifierType = cpeLocalIdentifierType;
            return this;
        }

        /**
         * @param cpeLocalIdentifierType (Updatable) The type of identifier for your CPE device. The value you provide here must correspond to the value for `cpeLocalIdentifier`.
         * 
         * @return builder
         * 
         */
        public Builder cpeLocalIdentifierType(String cpeLocalIdentifierType) {
            return cpeLocalIdentifierType(Output.of(cpeLocalIdentifierType));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param displayName (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param drgId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
         * 
         * @return builder
         * 
         */
        public Builder drgId(Output<String> drgId) {
            $.drgId = drgId;
            return this;
        }

        /**
         * @param drgId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
         * 
         * @return builder
         * 
         */
        public Builder drgId(String drgId) {
            return drgId(Output.of(drgId));
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param staticRoutes (Updatable) Static routes to the CPE. A static route&#39;s CIDR must not be a multicast address or class E address.
         * 
         * @return builder
         * 
         */
        public Builder staticRoutes(Output<List<String>> staticRoutes) {
            $.staticRoutes = staticRoutes;
            return this;
        }

        /**
         * @param staticRoutes (Updatable) Static routes to the CPE. A static route&#39;s CIDR must not be a multicast address or class E address.
         * 
         * @return builder
         * 
         */
        public Builder staticRoutes(List<String> staticRoutes) {
            return staticRoutes(Output.of(staticRoutes));
        }

        /**
         * @param staticRoutes (Updatable) Static routes to the CPE. A static route&#39;s CIDR must not be a multicast address or class E address.
         * 
         * @return builder
         * 
         */
        public Builder staticRoutes(String... staticRoutes) {
            return staticRoutes(List.of(staticRoutes));
        }

        public IpsecArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.cpeId = Objects.requireNonNull($.cpeId, "expected parameter 'cpeId' to be non-null");
            $.drgId = Objects.requireNonNull($.drgId, "expected parameter 'drgId' to be non-null");
            $.staticRoutes = Objects.requireNonNull($.staticRoutes, "expected parameter 'staticRoutes' to be non-null");
            return $;
        }
    }

}
