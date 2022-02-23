// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.notebooks_v1.RuntimeArgs;
import io.pulumi.googlenative.notebooks_v1.outputs.RuntimeAccessConfigResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.RuntimeMetricsResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.RuntimeSoftwareConfigResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.VirtualMachineResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new Runtime in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:notebooks/v1:Runtime")
public class Runtime extends io.pulumi.resources.CustomResource {
    /**
     * The config settings for accessing runtime.
     * 
     */
    @OutputExport(name="accessConfig", type=RuntimeAccessConfigResponse.class, parameters={})
    private Output<RuntimeAccessConfigResponse> accessConfig;

    /**
     * @return The config settings for accessing runtime.
     * 
     */
    public Output<RuntimeAccessConfigResponse> getAccessConfig() {
        return this.accessConfig;
    }
    /**
     * Runtime creation time.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Runtime creation time.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Runtime health_state.
     * 
     */
    @OutputExport(name="healthState", type=String.class, parameters={})
    private Output<String> healthState;

    /**
     * @return Runtime health_state.
     * 
     */
    public Output<String> getHealthState() {
        return this.healthState;
    }
    /**
     * Contains Runtime daemon metrics such as Service status and JupyterLab stats.
     * 
     */
    @OutputExport(name="metrics", type=RuntimeMetricsResponse.class, parameters={})
    private Output<RuntimeMetricsResponse> metrics;

    /**
     * @return Contains Runtime daemon metrics such as Service status and JupyterLab stats.
     * 
     */
    public Output<RuntimeMetricsResponse> getMetrics() {
        return this.metrics;
    }
    /**
     * The resource name of the runtime. Format: `projects/{project}/locations/{location}/runtimes/{runtimeId}`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the runtime. Format: `projects/{project}/locations/{location}/runtimes/{runtimeId}`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The config settings for software inside the runtime.
     * 
     */
    @OutputExport(name="softwareConfig", type=RuntimeSoftwareConfigResponse.class, parameters={})
    private Output<RuntimeSoftwareConfigResponse> softwareConfig;

    /**
     * @return The config settings for software inside the runtime.
     * 
     */
    public Output<RuntimeSoftwareConfigResponse> getSoftwareConfig() {
        return this.softwareConfig;
    }
    /**
     * Runtime state.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Runtime state.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Runtime update time.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Runtime update time.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Use a Compute Engine VM image to start the managed notebook instance.
     * 
     */
    @OutputExport(name="virtualMachine", type=VirtualMachineResponse.class, parameters={})
    private Output<VirtualMachineResponse> virtualMachine;

    /**
     * @return Use a Compute Engine VM image to start the managed notebook instance.
     * 
     */
    public Output<VirtualMachineResponse> getVirtualMachine() {
        return this.virtualMachine;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Runtime(String name) {
        this(name, RuntimeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Runtime(String name, RuntimeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Runtime(String name, RuntimeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:notebooks/v1:Runtime", name, args == null ? RuntimeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Runtime(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:notebooks/v1:Runtime", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Runtime get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Runtime(name, id, options);
    }
}
