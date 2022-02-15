// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.runtimeconfig;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.runtimeconfig.ConfigIamPolicyArgs;
import io.pulumi.gcp.runtimeconfig.inputs.ConfigIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:runtimeconfig/configIamPolicy:ConfigIamPolicy")
public class ConfigIamPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="config", type=String.class, parameters={})
    private Output<String> config;

    public Output<String> getConfig() {
        return this.config;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }

    public ConfigIamPolicy(String name, ConfigIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:runtimeconfig/configIamPolicy:ConfigIamPolicy", name, args == null ? ConfigIamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConfigIamPolicy(String name, Input<String> id, @Nullable ConfigIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:runtimeconfig/configIamPolicy:ConfigIamPolicy", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ConfigIamPolicy get(String name, Input<String> id, @Nullable ConfigIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConfigIamPolicy(name, id, state, options);
    }
}