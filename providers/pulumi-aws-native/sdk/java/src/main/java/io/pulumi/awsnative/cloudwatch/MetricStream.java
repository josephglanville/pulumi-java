// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudwatch;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudwatch.MetricStreamArgs;
import io.pulumi.awsnative.cloudwatch.outputs.MetricStreamFilter;
import io.pulumi.awsnative.cloudwatch.outputs.MetricStreamTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:cloudwatch:MetricStream")
public class MetricStream extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    @OutputExport(name="excludeFilters", type=List.class, parameters={MetricStreamFilter.class})
    private Output</* @Nullable */ List<MetricStreamFilter>> excludeFilters;

    public Output</* @Nullable */ List<MetricStreamFilter>> getExcludeFilters() {
        return this.excludeFilters;
    }
    @OutputExport(name="firehoseArn", type=String.class, parameters={})
    private Output<String> firehoseArn;

    public Output<String> getFirehoseArn() {
        return this.firehoseArn;
    }
    @OutputExport(name="includeFilters", type=List.class, parameters={MetricStreamFilter.class})
    private Output</* @Nullable */ List<MetricStreamFilter>> includeFilters;

    public Output</* @Nullable */ List<MetricStreamFilter>> getIncludeFilters() {
        return this.includeFilters;
    }
    @OutputExport(name="lastUpdateDate", type=String.class, parameters={})
    private Output<String> lastUpdateDate;

    public Output<String> getLastUpdateDate() {
        return this.lastUpdateDate;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="outputFormat", type=String.class, parameters={})
    private Output<String> outputFormat;

    public Output<String> getOutputFormat() {
        return this.outputFormat;
    }
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="tags", type=List.class, parameters={MetricStreamTag.class})
    private Output</* @Nullable */ List<MetricStreamTag>> tags;

    public Output</* @Nullable */ List<MetricStreamTag>> getTags() {
        return this.tags;
    }

    public MetricStream(String name, MetricStreamArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudwatch:MetricStream", name, args == null ? MetricStreamArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MetricStream(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudwatch:MetricStream", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static MetricStream get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MetricStream(name, id, options);
    }
}