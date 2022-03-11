// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devices.CertificateArgs;
import io.pulumi.azurenative.devices.outputs.CertificatePropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The X509 Certificate.
 * API Version: 2020-08-31.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devices:Certificate cert /subscriptions/91d12660-3dec-467a-be2a-213b5544ddc0/resourceGroups/myResourceGroup/providers/Microsoft.Devices/ProvisioningServives/myFirstProvisioningService/certificates/cert 
 * ```
 * 
 */
@ResourceType(type="azure-native:devices:Certificate")
public class Certificate extends io.pulumi.resources.CustomResource {
    /**
     * The entity tag.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The entity tag.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The name of the certificate.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the certificate.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The description of an X509 CA Certificate.
     * 
     */
    @OutputExport(name="properties", type=CertificatePropertiesResponse.class, parameters={})
    private Output<CertificatePropertiesResponse> properties;

    /**
     * @return The description of an X509 CA Certificate.
     * 
     */
    public Output<CertificatePropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * The resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(CertificateArgs.Builder a);
    }
    private static io.pulumi.azurenative.devices.CertificateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.devices.CertificateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Certificate(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(String name, CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, CertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devices:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Certificate(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devices:Certificate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:devices/v20170701:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20180122:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20180401:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20181201preview:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20190322:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20190322preview:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20190701preview:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20191104:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20200301:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20200401:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20200615:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20200710preview:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20200801:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20200831:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20200831preview:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20210201preview:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20210303preview:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20210331:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20210701:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20210701preview:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20210702:Certificate").build()),
                Output.of(Alias.builder().setType("azure-native:devices/v20210702preview:Certificate").build())
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
    public static Certificate get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, options);
    }
}
