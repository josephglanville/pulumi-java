// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusJmxExporterArgs;
import io.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusNodeExporterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterOpenMonitoringPrometheusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterOpenMonitoringPrometheusArgs Empty = new ClusterOpenMonitoringPrometheusArgs();

    /**
     * Configuration block for JMX Exporter. See below.
     * 
     */
    @Import(name="jmxExporter")
      private final @Nullable Output<ClusterOpenMonitoringPrometheusJmxExporterArgs> jmxExporter;

    public Output<ClusterOpenMonitoringPrometheusJmxExporterArgs> getJmxExporter() {
        return this.jmxExporter == null ? Output.empty() : this.jmxExporter;
    }

    /**
     * Configuration block for Node Exporter. See below.
     * 
     */
    @Import(name="nodeExporter")
      private final @Nullable Output<ClusterOpenMonitoringPrometheusNodeExporterArgs> nodeExporter;

    public Output<ClusterOpenMonitoringPrometheusNodeExporterArgs> getNodeExporter() {
        return this.nodeExporter == null ? Output.empty() : this.nodeExporter;
    }

    public ClusterOpenMonitoringPrometheusArgs(
        @Nullable Output<ClusterOpenMonitoringPrometheusJmxExporterArgs> jmxExporter,
        @Nullable Output<ClusterOpenMonitoringPrometheusNodeExporterArgs> nodeExporter) {
        this.jmxExporter = jmxExporter;
        this.nodeExporter = nodeExporter;
    }

    private ClusterOpenMonitoringPrometheusArgs() {
        this.jmxExporter = Output.empty();
        this.nodeExporter = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterOpenMonitoringPrometheusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterOpenMonitoringPrometheusJmxExporterArgs> jmxExporter;
        private @Nullable Output<ClusterOpenMonitoringPrometheusNodeExporterArgs> nodeExporter;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterOpenMonitoringPrometheusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jmxExporter = defaults.jmxExporter;
    	      this.nodeExporter = defaults.nodeExporter;
        }

        public Builder jmxExporter(@Nullable Output<ClusterOpenMonitoringPrometheusJmxExporterArgs> jmxExporter) {
            this.jmxExporter = jmxExporter;
            return this;
        }
        public Builder jmxExporter(@Nullable ClusterOpenMonitoringPrometheusJmxExporterArgs jmxExporter) {
            this.jmxExporter = Output.ofNullable(jmxExporter);
            return this;
        }
        public Builder nodeExporter(@Nullable Output<ClusterOpenMonitoringPrometheusNodeExporterArgs> nodeExporter) {
            this.nodeExporter = nodeExporter;
            return this;
        }
        public Builder nodeExporter(@Nullable ClusterOpenMonitoringPrometheusNodeExporterArgs nodeExporter) {
            this.nodeExporter = Output.ofNullable(nodeExporter);
            return this;
        }        public ClusterOpenMonitoringPrometheusArgs build() {
            return new ClusterOpenMonitoringPrometheusArgs(jmxExporter, nodeExporter);
        }
    }
}