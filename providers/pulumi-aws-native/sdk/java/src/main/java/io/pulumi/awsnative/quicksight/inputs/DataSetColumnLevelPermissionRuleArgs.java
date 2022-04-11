// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSetColumnLevelPermissionRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSetColumnLevelPermissionRuleArgs Empty = new DataSetColumnLevelPermissionRuleArgs();

    @Import(name="columnNames")
      private final @Nullable Output<List<String>> columnNames;

    public Output<List<String>> getColumnNames() {
        return this.columnNames == null ? Codegen.empty() : this.columnNames;
    }

    @Import(name="principals")
      private final @Nullable Output<List<String>> principals;

    public Output<List<String>> getPrincipals() {
        return this.principals == null ? Codegen.empty() : this.principals;
    }

    public DataSetColumnLevelPermissionRuleArgs(
        @Nullable Output<List<String>> columnNames,
        @Nullable Output<List<String>> principals) {
        this.columnNames = columnNames;
        this.principals = principals;
    }

    private DataSetColumnLevelPermissionRuleArgs() {
        this.columnNames = Codegen.empty();
        this.principals = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetColumnLevelPermissionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> columnNames;
        private @Nullable Output<List<String>> principals;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetColumnLevelPermissionRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnNames = defaults.columnNames;
    	      this.principals = defaults.principals;
        }

        public Builder columnNames(@Nullable Output<List<String>> columnNames) {
            this.columnNames = columnNames;
            return this;
        }
        public Builder columnNames(@Nullable List<String> columnNames) {
            this.columnNames = Codegen.ofNullable(columnNames);
            return this;
        }
        public Builder columnNames(String... columnNames) {
            return columnNames(List.of(columnNames));
        }
        public Builder principals(@Nullable Output<List<String>> principals) {
            this.principals = principals;
            return this;
        }
        public Builder principals(@Nullable List<String> principals) {
            this.principals = Codegen.ofNullable(principals);
            return this;
        }
        public Builder principals(String... principals) {
            return principals(List.of(principals));
        }        public DataSetColumnLevelPermissionRuleArgs build() {
            return new DataSetColumnLevelPermissionRuleArgs(columnNames, principals);
        }
    }
}
