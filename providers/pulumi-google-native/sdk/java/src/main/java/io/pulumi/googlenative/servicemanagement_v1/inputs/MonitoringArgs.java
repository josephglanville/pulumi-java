// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.servicemanagement_v1.inputs.MonitoringDestinationArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Monitoring configuration of the service. The example below shows how to configure monitored resources and metrics for monitoring. In the example, a monitored resource and two metrics are defined. The `library.googleapis.com/book/returned_count` metric is sent to both producer and consumer projects, whereas the `library.googleapis.com/book/num_overdue` metric is only sent to the consumer project. monitored_resources: - type: library.googleapis.com/Branch display_name: "Library Branch" description: "A branch of a library." launch_stage: GA labels: - key: resource_container description: "The Cloud container (ie. project id) for the Branch." - key: location description: "The location of the library branch." - key: branch_id description: "The id of the branch." metrics: - name: library.googleapis.com/book/returned_count display_name: "Books Returned" description: "The count of books that have been returned." launch_stage: GA metric_kind: DELTA value_type: INT64 unit: "1" labels: - key: customer_id description: "The id of the customer." - name: library.googleapis.com/book/num_overdue display_name: "Books Overdue" description: "The current number of overdue books." launch_stage: GA metric_kind: GAUGE value_type: INT64 unit: "1" labels: - key: customer_id description: "The id of the customer." monitoring: producer_destinations: - monitored_resource: library.googleapis.com/Branch metrics: - library.googleapis.com/book/returned_count consumer_destinations: - monitored_resource: library.googleapis.com/Branch metrics: - library.googleapis.com/book/returned_count - library.googleapis.com/book/num_overdue
 * 
 */
public final class MonitoringArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringArgs Empty = new MonitoringArgs();

    /**
     * Monitoring configurations for sending metrics to the consumer project. There can be multiple consumer destinations. A monitored resource type may appear in multiple monitoring destinations if different aggregations are needed for different sets of metrics associated with that monitored resource type. A monitored resource and metric pair may only be used once in the Monitoring configuration.
     * 
     */
    @Import(name="consumerDestinations")
      private final @Nullable Output<List<MonitoringDestinationArgs>> consumerDestinations;

    public Output<List<MonitoringDestinationArgs>> getConsumerDestinations() {
        return this.consumerDestinations == null ? Output.empty() : this.consumerDestinations;
    }

    /**
     * Monitoring configurations for sending metrics to the producer project. There can be multiple producer destinations. A monitored resource type may appear in multiple monitoring destinations if different aggregations are needed for different sets of metrics associated with that monitored resource type. A monitored resource and metric pair may only be used once in the Monitoring configuration.
     * 
     */
    @Import(name="producerDestinations")
      private final @Nullable Output<List<MonitoringDestinationArgs>> producerDestinations;

    public Output<List<MonitoringDestinationArgs>> getProducerDestinations() {
        return this.producerDestinations == null ? Output.empty() : this.producerDestinations;
    }

    public MonitoringArgs(
        @Nullable Output<List<MonitoringDestinationArgs>> consumerDestinations,
        @Nullable Output<List<MonitoringDestinationArgs>> producerDestinations) {
        this.consumerDestinations = consumerDestinations;
        this.producerDestinations = producerDestinations;
    }

    private MonitoringArgs() {
        this.consumerDestinations = Output.empty();
        this.producerDestinations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<MonitoringDestinationArgs>> consumerDestinations;
        private @Nullable Output<List<MonitoringDestinationArgs>> producerDestinations;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerDestinations = defaults.consumerDestinations;
    	      this.producerDestinations = defaults.producerDestinations;
        }

        public Builder consumerDestinations(@Nullable Output<List<MonitoringDestinationArgs>> consumerDestinations) {
            this.consumerDestinations = consumerDestinations;
            return this;
        }
        public Builder consumerDestinations(@Nullable List<MonitoringDestinationArgs> consumerDestinations) {
            this.consumerDestinations = Output.ofNullable(consumerDestinations);
            return this;
        }
        public Builder consumerDestinations(MonitoringDestinationArgs... consumerDestinations) {
            return consumerDestinations(List.of(consumerDestinations));
        }
        public Builder producerDestinations(@Nullable Output<List<MonitoringDestinationArgs>> producerDestinations) {
            this.producerDestinations = producerDestinations;
            return this;
        }
        public Builder producerDestinations(@Nullable List<MonitoringDestinationArgs> producerDestinations) {
            this.producerDestinations = Output.ofNullable(producerDestinations);
            return this;
        }
        public Builder producerDestinations(MonitoringDestinationArgs... producerDestinations) {
            return producerDestinations(List.of(producerDestinations));
        }        public MonitoringArgs build() {
            return new MonitoringArgs(consumerDestinations, producerDestinations);
        }
    }
}
