// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WorkflowTemplateJobHiveJobQueryListGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobHiveJobQueryListGetArgs Empty = new WorkflowTemplateJobHiveJobQueryListGetArgs();

    /**
     * Required. The queries to execute. You do not need to end a query expression with a semicolon. Multiple queries can be specified in one string by separating each with a semicolon. Here is an example of a Dataproc API snippet that uses a QueryList to specify a HiveJob: "hiveJob": { "queryList": { "queries": } }
     * 
     */
    @InputImport(name="queries", required=true)
      private final Input<List<String>> queries;

    public Input<List<String>> getQueries() {
        return this.queries;
    }

    public WorkflowTemplateJobHiveJobQueryListGetArgs(Input<List<String>> queries) {
        this.queries = Objects.requireNonNull(queries, "expected parameter 'queries' to be non-null");
    }

    private WorkflowTemplateJobHiveJobQueryListGetArgs() {
        this.queries = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobHiveJobQueryListGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> queries;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobHiveJobQueryListGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queries = defaults.queries;
        }

        public Builder setQueries(Input<List<String>> queries) {
            this.queries = Objects.requireNonNull(queries);
            return this;
        }

        public Builder setQueries(List<String> queries) {
            this.queries = Input.of(Objects.requireNonNull(queries));
            return this;
        }
        public WorkflowTemplateJobHiveJobQueryListGetArgs build() {
            return new WorkflowTemplateJobHiveJobQueryListGetArgs(queries);
        }
    }
}
