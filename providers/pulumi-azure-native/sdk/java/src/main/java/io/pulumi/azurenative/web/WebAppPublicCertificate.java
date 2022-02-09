// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppPublicCertificateArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:web:WebAppPublicCertificate")
public class WebAppPublicCertificate extends io.pulumi.resources.CustomResource {
    @OutputExport(name="blob", type=String.class, parameters={})
    private Output</* @Nullable */ String> blob;

    public Output</* @Nullable */ String> getBlob() {
        return this.blob;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="publicCertificateLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicCertificateLocation;

    public Output</* @Nullable */ String> getPublicCertificateLocation() {
        return this.publicCertificateLocation;
    }
    @OutputExport(name="thumbprint", type=String.class, parameters={})
    private Output<String> thumbprint;

    public Output<String> getThumbprint() {
        return this.thumbprint;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public WebAppPublicCertificate(String name, WebAppPublicCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppPublicCertificate", name, args == null ? WebAppPublicCertificateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppPublicCertificate(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppPublicCertificate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppPublicCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppPublicCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppPublicCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppPublicCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppPublicCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppPublicCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppPublicCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppPublicCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppPublicCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppPublicCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppPublicCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppPublicCertificate").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static WebAppPublicCertificate get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppPublicCertificate(name, id, options);
    }
}
