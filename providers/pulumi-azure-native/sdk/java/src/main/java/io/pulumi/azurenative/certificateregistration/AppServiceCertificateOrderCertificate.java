// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.certificateregistration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.certificateregistration.AppServiceCertificateOrderCertificateArgs;
import io.pulumi.azurenative.certificateregistration.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Key Vault container ARM resource for a certificate that is purchased through Azure.
 * API Version: 2020-10-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:certificateregistration:AppServiceCertificateOrderCertificate myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CertificateRegistration/certificateOrders/{certificateOrderName}/certificates/{name} 
 * ```
 * 
 */
@ResourceType(type="azure-native:certificateregistration:AppServiceCertificateOrderCertificate")
public class AppServiceCertificateOrderCertificate extends io.pulumi.resources.CustomResource {
    /**
     * Key Vault resource Id.
     * 
     */
    @OutputExport(name="keyVaultId", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyVaultId;

    /**
     * @return Key Vault resource Id.
     * 
     */
    public Output</* @Nullable */ String> getKeyVaultId() {
        return this.keyVaultId;
    }
    /**
     * Key Vault secret name.
     * 
     */
    @OutputExport(name="keyVaultSecretName", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyVaultSecretName;

    /**
     * @return Key Vault secret name.
     * 
     */
    public Output</* @Nullable */ String> getKeyVaultSecretName() {
        return this.keyVaultSecretName;
    }
    /**
     * Kind of resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Resource Location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Status of the Key Vault secret.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Status of the Key Vault secret.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppServiceCertificateOrderCertificate(String name) {
        this(name, AppServiceCertificateOrderCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppServiceCertificateOrderCertificate(String name, AppServiceCertificateOrderCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppServiceCertificateOrderCertificate(String name, AppServiceCertificateOrderCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:certificateregistration:AppServiceCertificateOrderCertificate", name, args == null ? AppServiceCertificateOrderCertificateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AppServiceCertificateOrderCertificate(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:certificateregistration:AppServiceCertificateOrderCertificate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:certificateregistration/v20150801:AppServiceCertificateOrderCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:certificateregistration/v20180201:AppServiceCertificateOrderCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:certificateregistration/v20190801:AppServiceCertificateOrderCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:certificateregistration/v20200601:AppServiceCertificateOrderCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:certificateregistration/v20200901:AppServiceCertificateOrderCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:certificateregistration/v20201001:AppServiceCertificateOrderCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:certificateregistration/v20201201:AppServiceCertificateOrderCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:certificateregistration/v20210101:AppServiceCertificateOrderCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:certificateregistration/v20210115:AppServiceCertificateOrderCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:certificateregistration/v20210201:AppServiceCertificateOrderCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:certificateregistration/v20210301:AppServiceCertificateOrderCertificate").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AppServiceCertificateOrderCertificate get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AppServiceCertificateOrderCertificate(name, id, options);
    }
}
