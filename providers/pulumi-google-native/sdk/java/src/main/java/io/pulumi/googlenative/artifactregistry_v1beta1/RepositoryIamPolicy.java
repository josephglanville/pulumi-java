// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.artifactregistry_v1beta1.RepositoryIamPolicyArgs;
import io.pulumi.googlenative.artifactregistry_v1beta1.outputs.BindingResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="google-native:artifactregistry/v1beta1:RepositoryIamPolicy")
public class RepositoryIamPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="bindings", type=List.class, parameters={BindingResponse.class})
    private Output<List<BindingResponse>> bindings;

    public Output<List<BindingResponse>> getBindings() {
        return this.bindings;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    public Output<Integer> getVersion() {
        return this.version;
    }

    public RepositoryIamPolicy(String name, RepositoryIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:artifactregistry/v1beta1:RepositoryIamPolicy", name, args == null ? RepositoryIamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RepositoryIamPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:artifactregistry/v1beta1:RepositoryIamPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static RepositoryIamPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RepositoryIamPolicy(name, id, options);
    }
}