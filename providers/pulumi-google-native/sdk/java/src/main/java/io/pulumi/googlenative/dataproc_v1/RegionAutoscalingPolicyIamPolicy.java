// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dataproc_v1.RegionAutoscalingPolicyIamPolicyArgs;
import io.pulumi.googlenative.dataproc_v1.outputs.BindingResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="google-native:dataproc/v1:RegionAutoscalingPolicyIamPolicy")
public class RegionAutoscalingPolicyIamPolicy extends io.pulumi.resources.CustomResource {
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

    public RegionAutoscalingPolicyIamPolicy(String name, RegionAutoscalingPolicyIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataproc/v1:RegionAutoscalingPolicyIamPolicy", name, args == null ? RegionAutoscalingPolicyIamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RegionAutoscalingPolicyIamPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataproc/v1:RegionAutoscalingPolicyIamPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static RegionAutoscalingPolicyIamPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionAutoscalingPolicyIamPolicy(name, id, options);
    }
}