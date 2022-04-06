// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directoryservice;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.directoryservice.DirectoryArgs;
import io.pulumi.aws.directoryservice.inputs.DirectoryState;
import io.pulumi.aws.directoryservice.outputs.DirectoryConnectSettings;
import io.pulumi.aws.directoryservice.outputs.DirectoryVpcSettings;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Simple or Managed Microsoft directory in AWS Directory Service.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DirectoryService directories can be imported using the directory `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:directoryservice/directory:Directory sample d-926724cf57
 * ```
 * 
 */
@ResourceType(type="aws:directoryservice/directory:Directory")
public class Directory extends io.pulumi.resources.CustomResource {
    /**
     * The access URL for the directory, such as `http://alias.awsapps.com`.
     * 
     */
    @Export(name="accessUrl", type=String.class, parameters={})
    private Output<String> accessUrl;

    /**
     * @return The access URL for the directory, such as `http://alias.awsapps.com`.
     * 
     */
    public Output<String> getAccessUrl() {
        return this.accessUrl;
    }
    /**
     * The alias for the directory (must be unique amongst all aliases in AWS). Required for `enable_sso`.
     * 
     */
    @Export(name="alias", type=String.class, parameters={})
    private Output<String> alias;

    /**
     * @return The alias for the directory (must be unique amongst all aliases in AWS). Required for `enable_sso`.
     * 
     */
    public Output<String> getAlias() {
        return this.alias;
    }
    /**
     * Connector related information about the directory. Fields documented below.
     * 
     */
    @Export(name="connectSettings", type=DirectoryConnectSettings.class, parameters={})
    private Output</* @Nullable */ DirectoryConnectSettings> connectSettings;

    /**
     * @return Connector related information about the directory. Fields documented below.
     * 
     */
    public Output</* @Nullable */ DirectoryConnectSettings> getConnectSettings() {
        return this.connectSettings;
    }
    /**
     * A textual description for the directory.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A textual description for the directory.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A list of IP addresses of the DNS servers for the directory or connector.
     * 
     */
    @Export(name="dnsIpAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> dnsIpAddresses;

    /**
     * @return A list of IP addresses of the DNS servers for the directory or connector.
     * 
     */
    public Output<List<String>> getDnsIpAddresses() {
        return this.dnsIpAddresses;
    }
    /**
     * The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise` (applies to MicrosoftAD type only).
     * 
     */
    @Export(name="edition", type=String.class, parameters={})
    private Output<String> edition;

    /**
     * @return The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise` (applies to MicrosoftAD type only).
     * 
     */
    public Output<String> getEdition() {
        return this.edition;
    }
    /**
     * Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
     * 
     */
    @Export(name="enableSso", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableSso;

    /**
     * @return Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableSso() {
        return this.enableSso;
    }
    /**
     * The fully qualified name for the directory, such as `corp.example.com`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The fully qualified name for the directory, such as `corp.example.com`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The password for the directory administrator or connector user.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return The password for the directory administrator or connector user.
     * 
     */
    public Output<String> getPassword() {
        return this.password;
    }
    /**
     * The ID of the security group created by the directory.
     * 
     */
    @Export(name="securityGroupId", type=String.class, parameters={})
    private Output<String> securityGroupId;

    /**
     * @return The ID of the security group created by the directory.
     * 
     */
    public Output<String> getSecurityGroupId() {
        return this.securityGroupId;
    }
    /**
     * The short name of the directory, such as `CORP`.
     * 
     */
    @Export(name="shortName", type=String.class, parameters={})
    private Output<String> shortName;

    /**
     * @return The short name of the directory, such as `CORP`.
     * 
     */
    public Output<String> getShortName() {
        return this.shortName;
    }
    /**
     * The size of the directory (`Small` or `Large` are accepted values).
     * 
     */
    @Export(name="size", type=String.class, parameters={})
    private Output<String> size;

    /**
     * @return The size of the directory (`Small` or `Large` are accepted values).
     * 
     */
    public Output<String> getSize() {
        return this.size;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }
    /**
     * VPC related information about the directory. Fields documented below.
     * 
     */
    @Export(name="vpcSettings", type=DirectoryVpcSettings.class, parameters={})
    private Output</* @Nullable */ DirectoryVpcSettings> vpcSettings;

    /**
     * @return VPC related information about the directory. Fields documented below.
     * 
     */
    public Output</* @Nullable */ DirectoryVpcSettings> getVpcSettings() {
        return this.vpcSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Directory(String name) {
        this(name, DirectoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Directory(String name, DirectoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Directory(String name, DirectoryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directoryservice/directory:Directory", name, args == null ? DirectoryArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Directory(String name, Output<String> id, @Nullable DirectoryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directoryservice/directory:Directory", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static Directory get(String name, Output<String> id, @Nullable DirectoryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Directory(name, id, state, options);
    }
}