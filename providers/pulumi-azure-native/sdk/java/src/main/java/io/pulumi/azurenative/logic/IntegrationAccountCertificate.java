// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.IntegrationAccountCertificateArgs;
import io.pulumi.azurenative.logic.outputs.KeyVaultKeyReferenceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The integration account certificate.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:IntegrationAccountCertificate testCertificate /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testResourceGroup/providers/Microsoft.Logic/integrationAccounts/testIntegrationAccount/certificates/testCertificate 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:IntegrationAccountCertificate")
public class IntegrationAccountCertificate extends io.pulumi.resources.CustomResource {
    /**
     * The changed time.
     * 
     */
    @OutputExport(name="changedTime", type=String.class, parameters={})
    private Output<String> changedTime;

    /**
     * @return The changed time.
     * 
     */
    public Output<String> getChangedTime() {
        return this.changedTime;
    }
    /**
     * The created time.
     * 
     */
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The created time.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The key details in the key vault.
     * 
     */
    @OutputExport(name="key", type=KeyVaultKeyReferenceResponse.class, parameters={})
    private Output</* @Nullable */ KeyVaultKeyReferenceResponse> key;

    /**
     * @return The key details in the key vault.
     * 
     */
    public Output</* @Nullable */ KeyVaultKeyReferenceResponse> getKey() {
        return this.key;
    }
    /**
     * The resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The metadata.
     * 
     */
    @OutputExport(name="metadata", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> metadata;

    /**
     * @return The metadata.
     * 
     */
    public Output</* @Nullable */ Object> getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The public certificate.
     * 
     */
    @OutputExport(name="publicCertificate", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicCertificate;

    /**
     * @return The public certificate.
     * 
     */
    public Output</* @Nullable */ String> getPublicCertificate() {
        return this.publicCertificate;
    }
    /**
     * The resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Gets the resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(IntegrationAccountCertificateArgs.Builder a);
    }
    private static io.pulumi.azurenative.logic.IntegrationAccountCertificateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.logic.IntegrationAccountCertificateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IntegrationAccountCertificate(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationAccountCertificate(String name) {
        this(name, IntegrationAccountCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationAccountCertificate(String name, IntegrationAccountCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationAccountCertificate(String name, IntegrationAccountCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountCertificate", name, args == null ? IntegrationAccountCertificateArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private IntegrationAccountCertificate(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountCertificate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:logic/v20150801preview:IntegrationAccountCertificate").build()),
                Output.of(Alias.builder().setType("azure-native:logic/v20160601:IntegrationAccountCertificate").build()),
                Output.of(Alias.builder().setType("azure-native:logic/v20180701preview:IntegrationAccountCertificate").build()),
                Output.of(Alias.builder().setType("azure-native:logic/v20190501:IntegrationAccountCertificate").build())
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
    public static IntegrationAccountCertificate get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationAccountCertificate(name, id, options);
    }
}
