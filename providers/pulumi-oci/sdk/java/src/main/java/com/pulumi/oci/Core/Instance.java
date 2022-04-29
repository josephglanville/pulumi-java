// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Core.InstanceArgs;
import com.pulumi.oci.Core.inputs.InstanceState;
import com.pulumi.oci.Core.outputs.InstanceAgentConfig;
import com.pulumi.oci.Core.outputs.InstanceAvailabilityConfig;
import com.pulumi.oci.Core.outputs.InstanceCreateVnicDetails;
import com.pulumi.oci.Core.outputs.InstanceInstanceOptions;
import com.pulumi.oci.Core.outputs.InstanceLaunchOptions;
import com.pulumi.oci.Core.outputs.InstancePlatformConfig;
import com.pulumi.oci.Core.outputs.InstancePreemptibleInstanceConfig;
import com.pulumi.oci.Core.outputs.InstanceShapeConfig;
import com.pulumi.oci.Core.outputs.InstanceSourceDetails;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provides the Instance resource in Oracle Cloud Infrastructure Core service.
 * 
 * Creates a new instance in the specified compartment and the specified availability domain.
 * For general information about instances, see
 * [Overview of the Compute Service](https://docs.cloud.oracle.com/iaas/Content/Compute/Concepts/computeoverview.htm).
 * 
 * For information about access control and compartments, see
 * [Overview of the IAM Service](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
 * 
 * For information about availability domains, see
 * [Regions and Availability Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm).
 * To get a list of availability domains, use the `ListAvailabilityDomains` operation
 * in the Identity and Access Management Service API.
 * 
 * All Oracle Cloud Infrastructure resources, including instances, get an Oracle-assigned,
 * unique ID called an Oracle Cloud Identifier (OCID).
 * When you create a resource, you can find its OCID in the response. You can
 * also retrieve a resource&#39;s OCID by using a List API operation
 * on that resource type, or by viewing the resource in the Console.
 * 
 * To launch an instance using an image or a boot volume use the `sourceDetails` parameter in [LaunchInstanceDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/LaunchInstanceDetails).
 * 
 * When you launch an instance, it is automatically attached to a virtual
 * network interface card (VNIC), called the *primary VNIC*. The VNIC
 * has a private IP address from the subnet&#39;s CIDR. You can either assign a
 * private IP address of your choice or let Oracle automatically assign one.
 * You can choose whether the instance has a public IP address. To retrieve the
 * addresses, use the [ListVnicAttachments](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/VnicAttachment/ListVnicAttachments)
 * operation to get the VNIC ID for the instance, and then call
 * [GetVnic](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Vnic/GetVnic) with the VNIC ID.
 * 
 * You can later add secondary VNICs to an instance. For more information, see
 * [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
 * 
 * To launch an instance from a Marketplace image listing, you must provide the image ID of the
 * listing resource version that you want, but you also must subscribe to the listing before you try
 * to launch the instance. To subscribe to the listing, use the [GetAppCatalogListingAgreements](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/AppCatalogListingResourceVersionAgreements/GetAppCatalogListingAgreements)
 * operation to get the signature for the terms of use agreement for the desired listing resource version.
 * Then, call [CreateAppCatalogSubscription](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/AppCatalogSubscription/CreateAppCatalogSubscription)
 * with the signature. To get the image ID for the LaunchInstance operation, call
 * [GetAppCatalogListingResourceVersion](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/AppCatalogListingResourceVersion/GetAppCatalogListingResourceVersion).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Instances can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Core/instance:Instance test_instance &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Core/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) Configuration options for the Oracle Cloud Agent software running on the instance.
     * 
     */
    @Export(name="agentConfig", type=InstanceAgentConfig.class, parameters={})
    private Output<InstanceAgentConfig> agentConfig;

    /**
     * @return (Updatable) Configuration options for the Oracle Cloud Agent software running on the instance.
     * 
     */
    public Output<InstanceAgentConfig> agentConfig() {
        return this.agentConfig;
    }
    @Export(name="async", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> async;

    public Output<Optional<Boolean>> async() {
        return Codegen.optional(this.async);
    }
    /**
     * (Updatable) Options for defining the availability of a VM instance after a maintenance event that impacts the underlying hardware.  This also includes live migration preference for infrastructure maintenance.
     * 
     */
    @Export(name="availabilityConfig", type=InstanceAvailabilityConfig.class, parameters={})
    private Output<InstanceAvailabilityConfig> availabilityConfig;

    /**
     * @return (Updatable) Options for defining the availability of a VM instance after a maintenance event that impacts the underlying hardware.  This also includes live migration preference for infrastructure maintenance.
     * 
     */
    public Output<InstanceAvailabilityConfig> availabilityConfig() {
        return this.availabilityConfig;
    }
    /**
     * The availability domain of the instance.  Example: `Uocm:PHX-AD-1`
     * 
     */
    @Export(name="availabilityDomain", type=String.class, parameters={})
    private Output<String> availabilityDomain;

    /**
     * @return The availability domain of the instance.  Example: `Uocm:PHX-AD-1`
     * 
     */
    public Output<String> availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * The OCID of the attached boot volume. If the `source_type` is `bootVolume`, this will be the same OCID as the `source_id`.
     * 
     */
    @Export(name="bootVolumeId", type=String.class, parameters={})
    private Output<String> bootVolumeId;

    /**
     * @return The OCID of the attached boot volume. If the `source_type` is `bootVolume`, this will be the same OCID as the `source_id`.
     * 
     */
    public Output<String> bootVolumeId() {
        return this.bootVolumeId;
    }
    /**
     * (Updatable) The OCID of the compute capacity reservation this instance is launched under. You can opt out of all default reservations by specifying an empty string as input for this field. For more information, see [Capacity Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
     * 
     */
    @Export(name="capacityReservationId", type=String.class, parameters={})
    private Output<String> capacityReservationId;

    /**
     * @return (Updatable) The OCID of the compute capacity reservation this instance is launched under. You can opt out of all default reservations by specifying an empty string as input for this field. For more information, see [Capacity Reservations](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
     * 
     */
    public Output<String> capacityReservationId() {
        return this.capacityReservationId;
    }
    /**
     * (Updatable) The OCID of the compartment.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * (Updatable) Contains properties for a VNIC. You use this object when creating the primary VNIC during instance launch or when creating a secondary VNIC. For more information about VNICs, see [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     * 
     */
    @Export(name="createVnicDetails", type=InstanceCreateVnicDetails.class, parameters={})
    private Output<InstanceCreateVnicDetails> createVnicDetails;

    /**
     * @return (Updatable) Contains properties for a VNIC. You use this object when creating the primary VNIC during instance launch or when creating a secondary VNIC. For more information about VNICs, see [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     * 
     */
    public Output<InstanceCreateVnicDetails> createVnicDetails() {
        return this.createVnicDetails;
    }
    /**
     * The OCID of dedicated VM host.
     * 
     */
    @Export(name="dedicatedVmHostId", type=String.class, parameters={})
    private Output<String> dedicatedVmHostId;

    /**
     * @return The OCID of dedicated VM host.
     * 
     */
    public Output<String> dedicatedVmHostId() {
        return this.dedicatedVmHostId;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * (Updatable) Additional metadata key/value pairs that you provide. They serve the same purpose and functionality as fields in the `metadata` object.
     * 
     */
    @Export(name="extendedMetadata", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> extendedMetadata;

    /**
     * @return (Updatable) Additional metadata key/value pairs that you provide. They serve the same purpose and functionality as fields in the `metadata` object.
     * 
     */
    public Output<Optional<Map<String,Object>>> extendedMetadata() {
        return Codegen.optional(this.extendedMetadata);
    }
    /**
     * (Updatable) A fault domain is a grouping of hardware and infrastructure within an availability domain. Each availability domain contains three fault domains. Fault domains let you distribute your instances so that they are not on the same physical hardware within a single availability domain. A hardware failure or Compute hardware maintenance that affects one fault domain does not affect instances in other fault domains.
     * 
     */
    @Export(name="faultDomain", type=String.class, parameters={})
    private Output<String> faultDomain;

    /**
     * @return (Updatable) A fault domain is a grouping of hardware and infrastructure within an availability domain. Each availability domain contains three fault domains. Fault domains let you distribute your instances so that they are not on the same physical hardware within a single availability domain. A hardware failure or Compute hardware maintenance that affects one fault domain does not affect instances in other fault domains.
     * 
     */
    public Output<String> faultDomain() {
        return this.faultDomain;
    }
    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * Deprecated. Instead use `hostnameLabel` in [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/). If you provide both, the values must match.
     * 
     * @deprecated
     * The &#39;hostname_label&#39; field has been deprecated. Please use &#39;hostname_label under create_vnic_details&#39; instead.
     * 
     */
    @Deprecated /* The 'hostname_label' field has been deprecated. Please use 'hostname_label under create_vnic_details' instead. */
    @Export(name="hostnameLabel", type=String.class, parameters={})
    private Output<String> hostnameLabel;

    /**
     * @return Deprecated. Instead use `hostnameLabel` in [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/). If you provide both, the values must match.
     * 
     */
    public Output<String> hostnameLabel() {
        return this.hostnameLabel;
    }
    /**
     * Deprecated. Use `sourceDetails` with [InstanceSourceViaImageDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/requests/InstanceSourceViaImageDetails) source type instead. If you specify values for both, the values must match.
     * 
     * @deprecated
     * The &#39;image&#39; field has been deprecated. Please use &#39;source_details&#39; instead. If both fields are specified, then &#39;source_details&#39; will be used.
     * 
     */
    @Deprecated /* The 'image' field has been deprecated. Please use 'source_details' instead. If both fields are specified, then 'source_details' will be used. */
    @Export(name="image", type=String.class, parameters={})
    private Output<String> image;

    /**
     * @return Deprecated. Use `sourceDetails` with [InstanceSourceViaImageDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/requests/InstanceSourceViaImageDetails) source type instead. If you specify values for both, the values must match.
     * 
     */
    public Output<String> image() {
        return this.image;
    }
    /**
     * (Updatable) Optional mutable instance options
     * 
     */
    @Export(name="instanceOptions", type=InstanceInstanceOptions.class, parameters={})
    private Output<InstanceInstanceOptions> instanceOptions;

    /**
     * @return (Updatable) Optional mutable instance options
     * 
     */
    public Output<InstanceInstanceOptions> instanceOptions() {
        return this.instanceOptions;
    }
    /**
     * This is an advanced option.
     * 
     */
    @Export(name="ipxeScript", type=String.class, parameters={})
    private Output<String> ipxeScript;

    /**
     * @return This is an advanced option.
     * 
     */
    public Output<String> ipxeScript() {
        return this.ipxeScript;
    }
    /**
     * (Updatable) Use this for update operation only. This field is  Deprecated during create. For create use `isPvEncryptionInTransitEnabled` in [LaunchInstanceDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/datatypes/LaunchInstanceDetails).
     * 
     */
    @Export(name="isPvEncryptionInTransitEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isPvEncryptionInTransitEnabled;

    /**
     * @return (Updatable) Use this for update operation only. This field is  Deprecated during create. For create use `isPvEncryptionInTransitEnabled` in [LaunchInstanceDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/datatypes/LaunchInstanceDetails).
     * 
     */
    public Output<Boolean> isPvEncryptionInTransitEnabled() {
        return this.isPvEncryptionInTransitEnabled;
    }
    /**
     * Specifies the configuration mode for launching virtual machine (VM) instances. The configuration modes are:
     * 
     */
    @Export(name="launchMode", type=String.class, parameters={})
    private Output<String> launchMode;

    /**
     * @return Specifies the configuration mode for launching virtual machine (VM) instances. The configuration modes are:
     * 
     */
    public Output<String> launchMode() {
        return this.launchMode;
    }
    /**
     * (Updatable) Options for tuning the compatibility and performance of VM shapes. The values that you specify override any default values.
     * 
     */
    @Export(name="launchOptions", type=InstanceLaunchOptions.class, parameters={})
    private Output<InstanceLaunchOptions> launchOptions;

    /**
     * @return (Updatable) Options for tuning the compatibility and performance of VM shapes. The values that you specify override any default values.
     * 
     */
    public Output<InstanceLaunchOptions> launchOptions() {
        return this.launchOptions;
    }
    /**
     * (Updatable) Custom metadata key/value pairs that you provide, such as the SSH public key required to connect to the instance.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> metadata;

    /**
     * @return (Updatable) Custom metadata key/value pairs that you provide, such as the SSH public key required to connect to the instance.
     * 
     */
    public Output<Optional<Map<String,Object>>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * The platform configuration requested for the instance.
     * 
     */
    @Export(name="platformConfig", type=InstancePlatformConfig.class, parameters={})
    private Output<InstancePlatformConfig> platformConfig;

    /**
     * @return The platform configuration requested for the instance.
     * 
     */
    public Output<InstancePlatformConfig> platformConfig() {
        return this.platformConfig;
    }
    /**
     * Configuration options for preemptible instances.
     * 
     */
    @Export(name="preemptibleInstanceConfig", type=InstancePreemptibleInstanceConfig.class, parameters={})
    private Output<InstancePreemptibleInstanceConfig> preemptibleInstanceConfig;

    /**
     * @return Configuration options for preemptible instances.
     * 
     */
    public Output<InstancePreemptibleInstanceConfig> preemptibleInstanceConfig() {
        return this.preemptibleInstanceConfig;
    }
    /**
     * Whether to preserve the boot volume that was used to launch the preemptible instance when the instance is terminated. Defaults to false if not specified.
     * 
     */
    @Export(name="preserveBootVolume", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> preserveBootVolume;

    /**
     * @return Whether to preserve the boot volume that was used to launch the preemptible instance when the instance is terminated. Defaults to false if not specified.
     * 
     */
    public Output<Optional<Boolean>> preserveBootVolume() {
        return Codegen.optional(this.preserveBootVolume);
    }
    /**
     * A private IP address of your choice to assign to the VNIC. Must be an available IP address within the subnet&#39;s CIDR. If you don&#39;t specify a value, Oracle automatically assigns a private IP address from the subnet. This is the VNIC&#39;s *primary* private IP address. The value appears in the [Vnic](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Vnic/) object and also the [PrivateIp](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/PrivateIp/) object returned by [ListPrivateIps](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/PrivateIp/ListPrivateIps) and [GetPrivateIp](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/PrivateIp/GetPrivateIp).
     * 
     */
    @Export(name="privateIp", type=String.class, parameters={})
    private Output<String> privateIp;

    /**
     * @return A private IP address of your choice to assign to the VNIC. Must be an available IP address within the subnet&#39;s CIDR. If you don&#39;t specify a value, Oracle automatically assigns a private IP address from the subnet. This is the VNIC&#39;s *primary* private IP address. The value appears in the [Vnic](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Vnic/) object and also the [PrivateIp](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/PrivateIp/) object returned by [ListPrivateIps](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/PrivateIp/ListPrivateIps) and [GetPrivateIp](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/PrivateIp/GetPrivateIp).
     * 
     */
    public Output<String> privateIp() {
        return this.privateIp;
    }
    /**
     * The public IP address of instance VNIC (if enabled).
     * 
     */
    @Export(name="publicIp", type=String.class, parameters={})
    private Output<String> publicIp;

    /**
     * @return The public IP address of instance VNIC (if enabled).
     * 
     */
    public Output<String> publicIp() {
        return this.publicIp;
    }
    /**
     * The region that contains the availability domain the instance is running in.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region that contains the availability domain the instance is running in.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * (Updatable) The shape of an instance. The shape determines the number of CPUs, amount of memory, and other resources allocated to the instance.
     * 
     */
    @Export(name="shape", type=String.class, parameters={})
    private Output<String> shape;

    /**
     * @return (Updatable) The shape of an instance. The shape determines the number of CPUs, amount of memory, and other resources allocated to the instance.
     * 
     */
    public Output<String> shape() {
        return this.shape;
    }
    /**
     * (Updatable) The shape configuration requested for the instance.
     * 
     */
    @Export(name="shapeConfig", type=InstanceShapeConfig.class, parameters={})
    private Output<InstanceShapeConfig> shapeConfig;

    /**
     * @return (Updatable) The shape configuration requested for the instance.
     * 
     */
    public Output<InstanceShapeConfig> shapeConfig() {
        return this.shapeConfig;
    }
    /**
     * (Updatable)
     * 
     */
    @Export(name="sourceDetails", type=InstanceSourceDetails.class, parameters={})
    private Output<InstanceSourceDetails> sourceDetails;

    /**
     * @return (Updatable)
     * 
     */
    public Output<InstanceSourceDetails> sourceDetails() {
        return this.sourceDetails;
    }
    /**
     * (Updatable) The target state for the instance. Could be set to RUNNING or STOPPED.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return (Updatable) The target state for the instance. Could be set to RUNNING or STOPPED.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Deprecated. Instead use `subnetId` in [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/). At least one of them is required; if you provide both, the values must match.
     * 
     * @deprecated
     * The &#39;subnet_id&#39; field has been deprecated. Please use &#39;subnet_id under create_vnic_details&#39; instead.
     * 
     */
    @Deprecated /* The 'subnet_id' field has been deprecated. Please use 'subnet_id under create_vnic_details' instead. */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return Deprecated. Instead use `subnetId` in [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/). At least one of them is required; if you provide both, the values must match.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }
    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="systemTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> systemTags;

    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> systemTags() {
        return this.systemTags;
    }
    /**
     * The date and time the instance was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date and time the instance was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The date and time the instance is expected to be stopped / started,  in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). After that time if instance hasn&#39;t been rebooted, Oracle will reboot the instance within 24 hours of the due time. Regardless of how the instance was stopped, the flag will be reset to empty as soon as instance reaches Stopped state. Example: `2018-05-25T21:10:29.600Z`
     * 
     */
    @Export(name="timeMaintenanceRebootDue", type=String.class, parameters={})
    private Output<String> timeMaintenanceRebootDue;

    /**
     * @return The date and time the instance is expected to be stopped / started,  in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). After that time if instance hasn&#39;t been rebooted, Oracle will reboot the instance within 24 hours of the due time. Regardless of how the instance was stopped, the flag will be reset to empty as soon as instance reaches Stopped state. Example: `2018-05-25T21:10:29.600Z`
     * 
     */
    public Output<String> timeMaintenanceRebootDue() {
        return this.timeMaintenanceRebootDue;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Core/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Core/instance:Instance", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
