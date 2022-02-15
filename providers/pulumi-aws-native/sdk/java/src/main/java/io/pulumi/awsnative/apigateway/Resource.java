// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.ResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:apigateway:Resource")
public class Resource extends io.pulumi.resources.CustomResource {
    @OutputExport(name="parentId", type=String.class, parameters={})
    private Output<String> parentId;

    public Output<String> getParentId() {
        return this.parentId;
    }
    @OutputExport(name="pathPart", type=String.class, parameters={})
    private Output<String> pathPart;

    public Output<String> getPathPart() {
        return this.pathPart;
    }
    @OutputExport(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId;
    }
    @OutputExport(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    public Output<String> getRestApiId() {
        return this.restApiId;
    }

    public Resource(String name, ResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Resource", name, args == null ? ResourceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Resource(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Resource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Resource get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Resource(name, id, options);
    }
}