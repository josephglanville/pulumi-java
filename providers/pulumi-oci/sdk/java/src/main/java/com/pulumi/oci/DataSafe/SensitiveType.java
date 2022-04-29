// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.DataSafe.SensitiveTypeArgs;
import com.pulumi.oci.DataSafe.inputs.SensitiveTypeState;
import com.pulumi.oci.Utilities;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Sensitive Type resource in Oracle Cloud Infrastructure Data Safe service.
 * 
 * Creates a new sensitive type, which can be a basic sensitive type with regular expressions or a sensitive category.
 * While sensitive types are used for data discovery, sensitive categories are used for logically grouping the related
 * or similar sensitive types.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SensitiveTypes can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:DataSafe/sensitiveType:SensitiveType test_sensitive_type &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:DataSafe/sensitiveType:SensitiveType")
public class SensitiveType extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) A regular expression to be used by data discovery for matching column comments.
     * 
     */
    @Export(name="commentPattern", type=String.class, parameters={})
    private Output<String> commentPattern;

    /**
     * @return (Updatable) A regular expression to be used by data discovery for matching column comments.
     * 
     */
    public Output<String> commentPattern() {
        return this.commentPattern;
    }
    /**
     * (Updatable) The OCID of the compartment where the sensitive type should be created.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the compartment where the sensitive type should be created.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * (Updatable) A regular expression to be used by data discovery for matching column data values.
     * 
     */
    @Export(name="dataPattern", type=String.class, parameters={})
    private Output<String> dataPattern;

    /**
     * @return (Updatable) A regular expression to be used by data discovery for matching column data values.
     * 
     */
    public Output<String> dataPattern() {
        return this.dataPattern;
    }
    /**
     * (Updatable) The OCID of the library masking format that should be used to mask the sensitive columns associated with the sensitive type.
     * 
     */
    @Export(name="defaultMaskingFormatId", type=String.class, parameters={})
    private Output<String> defaultMaskingFormatId;

    /**
     * @return (Updatable) The OCID of the library masking format that should be used to mask the sensitive columns associated with the sensitive type.
     * 
     */
    public Output<String> defaultMaskingFormatId() {
        return this.defaultMaskingFormatId;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) The description of the sensitive type.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return (Updatable) The description of the sensitive type.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * (Updatable) The display name of the sensitive type. The name does not have to be unique, and it&#39;s changeable.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) The display name of the sensitive type. The name does not have to be unique, and it&#39;s changeable.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * (Updatable) The entity type. It can be either a sensitive type with regular expressions or a sensitive category used for grouping similar sensitive types.
     * 
     */
    @Export(name="entityType", type=String.class, parameters={})
    private Output<String> entityType;

    /**
     * @return (Updatable) The entity type. It can be either a sensitive type with regular expressions or a sensitive category used for grouping similar sensitive types.
     * 
     */
    public Output<String> entityType() {
        return this.entityType;
    }
    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * (Updatable) A regular expression to be used by data discovery for matching column names.
     * 
     */
    @Export(name="namePattern", type=String.class, parameters={})
    private Output<String> namePattern;

    /**
     * @return (Updatable) A regular expression to be used by data discovery for matching column names.
     * 
     */
    public Output<String> namePattern() {
        return this.namePattern;
    }
    /**
     * (Updatable) The OCID of the parent sensitive category.
     * 
     */
    @Export(name="parentCategoryId", type=String.class, parameters={})
    private Output<String> parentCategoryId;

    /**
     * @return (Updatable) The OCID of the parent sensitive category.
     * 
     */
    public Output<String> parentCategoryId() {
        return this.parentCategoryId;
    }
    /**
     * (Updatable) The search type indicating how the column name, comment and data patterns should be used by data discovery. [Learn more](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/sensitive-types.html#GUID-1D1AD98E-B93F-4FF2-80AE-CB7D8A14F6CC).
     * 
     */
    @Export(name="searchType", type=String.class, parameters={})
    private Output<String> searchType;

    /**
     * @return (Updatable) The search type indicating how the column name, comment and data patterns should be used by data discovery. [Learn more](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/sensitive-types.html#GUID-1D1AD98E-B93F-4FF2-80AE-CB7D8A14F6CC).
     * 
     */
    public Output<String> searchType() {
        return this.searchType;
    }
    /**
     * (Updatable) The short name of the sensitive type.
     * 
     */
    @Export(name="shortName", type=String.class, parameters={})
    private Output<String> shortName;

    /**
     * @return (Updatable) The short name of the sensitive type.
     * 
     */
    public Output<String> shortName() {
        return this.shortName;
    }
    /**
     * Specifies whether the sensitive type is user-defined or predefined.
     * 
     */
    @Export(name="source", type=String.class, parameters={})
    private Output<String> source;

    /**
     * @return Specifies whether the sensitive type is user-defined or predefined.
     * 
     */
    public Output<String> source() {
        return this.source;
    }
    /**
     * The current state of the sensitive type.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the sensitive type.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    @Export(name="systemTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> systemTags;

    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Output<Map<String,Object>> systemTags() {
        return this.systemTags;
    }
    /**
     * The date and time the sensitive type was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date and time the sensitive type was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The date and time the sensitive type was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    @Export(name="timeUpdated", type=String.class, parameters={})
    private Output<String> timeUpdated;

    /**
     * @return The date and time the sensitive type was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public Output<String> timeUpdated() {
        return this.timeUpdated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SensitiveType(String name) {
        this(name, SensitiveTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SensitiveType(String name, SensitiveTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SensitiveType(String name, SensitiveTypeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DataSafe/sensitiveType:SensitiveType", name, args == null ? SensitiveTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SensitiveType(String name, Output<String> id, @Nullable SensitiveTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DataSafe/sensitiveType:SensitiveType", name, state, makeResourceOptions(options, id));
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
    public static SensitiveType get(String name, Output<String> id, @Nullable SensitiveTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SensitiveType(name, id, state, options);
    }
}
