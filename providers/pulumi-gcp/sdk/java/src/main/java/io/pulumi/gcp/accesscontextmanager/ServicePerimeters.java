// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.accesscontextmanager.ServicePerimetersArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersState;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeter;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:accesscontextmanager/servicePerimeters:ServicePerimeters")
public class ServicePerimeters extends io.pulumi.resources.CustomResource {
    @OutputExport(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    public Output<String> getParent() {
        return this.parent;
    }
    @OutputExport(name="servicePerimeters", type=List.class, parameters={ServicePerimetersServicePerimeter.class})
    private Output</* @Nullable */ List<ServicePerimetersServicePerimeter>> servicePerimeters;

    public Output</* @Nullable */ List<ServicePerimetersServicePerimeter>> getServicePerimeters() {
        return this.servicePerimeters;
    }

    public ServicePerimeters(String name, ServicePerimetersArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/servicePerimeters:ServicePerimeters", name, args == null ? ServicePerimetersArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServicePerimeters(String name, Input<String> id, @Nullable ServicePerimetersState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/servicePerimeters:ServicePerimeters", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ServicePerimeters get(String name, Input<String> id, @Nullable ServicePerimetersState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServicePerimeters(name, id, state, options);
    }
}