// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.LongTermRetentionPolicyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:sql:LongTermRetentionPolicy")
public class LongTermRetentionPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="monthlyRetention", type=String.class, parameters={})
    private Output</* @Nullable */ String> monthlyRetention;

    public Output</* @Nullable */ String> getMonthlyRetention() {
        return this.monthlyRetention;
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
    @OutputExport(name="weekOfYear", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> weekOfYear;

    public Output</* @Nullable */ Integer> getWeekOfYear() {
        return this.weekOfYear;
    }
    @OutputExport(name="weeklyRetention", type=String.class, parameters={})
    private Output</* @Nullable */ String> weeklyRetention;

    public Output</* @Nullable */ String> getWeeklyRetention() {
        return this.weeklyRetention;
    }
    @OutputExport(name="yearlyRetention", type=String.class, parameters={})
    private Output</* @Nullable */ String> yearlyRetention;

    public Output</* @Nullable */ String> getYearlyRetention() {
        return this.yearlyRetention;
    }

    public LongTermRetentionPolicy(String name, LongTermRetentionPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:LongTermRetentionPolicy", name, args == null ? LongTermRetentionPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LongTermRetentionPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:LongTermRetentionPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20170301preview:LongTermRetentionPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:LongTermRetentionPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:LongTermRetentionPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:LongTermRetentionPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:LongTermRetentionPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:LongTermRetentionPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:LongTermRetentionPolicy").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static LongTermRetentionPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LongTermRetentionPolicy(name, id, options);
    }
}
