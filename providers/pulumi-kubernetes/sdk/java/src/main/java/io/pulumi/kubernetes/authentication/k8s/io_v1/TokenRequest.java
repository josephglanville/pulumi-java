// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authentication.k8s.io_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.authentication.k8s.io_v1.TokenRequestArgs;
import io.pulumi.kubernetes.authentication.k8s.io_v1.outputs.TokenRequestSpec;
import io.pulumi.kubernetes.authentication.k8s.io_v1.outputs.TokenRequestStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:authentication.k8s.io/v1:TokenRequest")
public class TokenRequest extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="spec", type=TokenRequestSpec.class, parameters={})
    private Output<TokenRequestSpec> spec;

    public Output<TokenRequestSpec> getSpec() {
        return this.spec;
    }
    @OutputExport(name="status", type=TokenRequestStatus.class, parameters={})
    private Output</* @Nullable */ TokenRequestStatus> status;

    public Output</* @Nullable */ TokenRequestStatus> getStatus() {
        return this.status;
    }

    public TokenRequest(String name, TokenRequestArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authentication.k8s.io/v1:TokenRequest", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private TokenRequest(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authentication.k8s.io/v1:TokenRequest", name, null, makeResourceOptions(options, id));
    }

    private static TokenRequestArgs makeArgs(TokenRequestArgs args) {
        var builder = args == null ? TokenRequestArgs.builder() : TokenRequestArgs.builder(args);
        return builder
            .setApiVersion("authentication.k8s.io/v1")
            .setKind("TokenRequest")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static TokenRequest get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TokenRequest(name, id, options);
    }
}
