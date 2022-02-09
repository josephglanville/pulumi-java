// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.JobTargetGroupArgs;
import io.pulumi.azurenative.sql.outputs.JobTargetResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:sql:JobTargetGroup")
public class JobTargetGroup extends io.pulumi.resources.CustomResource {
    @OutputExport(name="members", type=List.class, parameters={JobTargetResponse.class})
    private Output<List<JobTargetResponse>> members;

    public Output<List<JobTargetResponse>> getMembers() {
        return this.members;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public JobTargetGroup(String name, JobTargetGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobTargetGroup", name, args == null ? JobTargetGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private JobTargetGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobTargetGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20170301preview:JobTargetGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:JobTargetGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:JobTargetGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:JobTargetGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:JobTargetGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:JobTargetGroup").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:JobTargetGroup").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static JobTargetGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JobTargetGroup(name, id, options);
    }
}
