// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.DatastreamAzureConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamDatadogConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamDeliveryConfigurationArgs;
import com.pulumi.akamai.inputs.DatastreamElasticsearchConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamGcsConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamHttpsConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamLogglyConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamNewRelicConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamOracleConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamS3ConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamSplunkConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamSumologicConnectorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastreamState extends com.pulumi.resources.ResourceArgs {

    public static final DatastreamState Empty = new DatastreamState();

    /**
     * Defining if stream should be active or not
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return Defining if stream should be active or not
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    @Import(name="azureConnector")
    private @Nullable Output<DatastreamAzureConnectorArgs> azureConnector;

    public Optional<Output<DatastreamAzureConnectorArgs>> azureConnector() {
        return Optional.ofNullable(this.azureConnector);
    }

    /**
     * Identifies if stream needs to collect midgress data
     * 
     */
    @Import(name="collectMidgress")
    private @Nullable Output<Boolean> collectMidgress;

    /**
     * @return Identifies if stream needs to collect midgress data
     * 
     */
    public Optional<Output<Boolean>> collectMidgress() {
        return Optional.ofNullable(this.collectMidgress);
    }

    /**
     * Identifies the contract that has access to the product
     * 
     */
    @Import(name="contractId")
    private @Nullable Output<String> contractId;

    /**
     * @return Identifies the contract that has access to the product
     * 
     */
    public Optional<Output<String>> contractId() {
        return Optional.ofNullable(this.contractId);
    }

    /**
     * The username who created the stream
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return The username who created the stream
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * The date and time when the stream was created
     * 
     */
    @Import(name="createdDate")
    private @Nullable Output<String> createdDate;

    /**
     * @return The date and time when the stream was created
     * 
     */
    public Optional<Output<String>> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }

    @Import(name="datadogConnector")
    private @Nullable Output<DatastreamDatadogConnectorArgs> datadogConnector;

    public Optional<Output<DatastreamDatadogConnectorArgs>> datadogConnector() {
        return Optional.ofNullable(this.datadogConnector);
    }

    /**
     * A list of data set fields selected from the associated template that the stream monitors in logs. The order of the
     * identifiers define how the value for these fields appear in the log lines
     * 
     */
    @Import(name="datasetFields")
    private @Nullable Output<List<Integer>> datasetFields;

    /**
     * @return A list of data set fields selected from the associated template that the stream monitors in logs. The order of the
     * identifiers define how the value for these fields appear in the log lines
     * 
     */
    public Optional<Output<List<Integer>>> datasetFields() {
        return Optional.ofNullable(this.datasetFields);
    }

    /**
     * Provides information about the configuration related to logs (format, file names, delivery frequency)
     * 
     */
    @Import(name="deliveryConfiguration")
    private @Nullable Output<DatastreamDeliveryConfigurationArgs> deliveryConfiguration;

    /**
     * @return Provides information about the configuration related to logs (format, file names, delivery frequency)
     * 
     */
    public Optional<Output<DatastreamDeliveryConfigurationArgs>> deliveryConfiguration() {
        return Optional.ofNullable(this.deliveryConfiguration);
    }

    @Import(name="elasticsearchConnector")
    private @Nullable Output<DatastreamElasticsearchConnectorArgs> elasticsearchConnector;

    public Optional<Output<DatastreamElasticsearchConnectorArgs>> elasticsearchConnector() {
        return Optional.ofNullable(this.elasticsearchConnector);
    }

    @Import(name="gcsConnector")
    private @Nullable Output<DatastreamGcsConnectorArgs> gcsConnector;

    public Optional<Output<DatastreamGcsConnectorArgs>> gcsConnector() {
        return Optional.ofNullable(this.gcsConnector);
    }

    /**
     * Identifies the group that has access to the product and for which the stream configuration was created
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return Identifies the group that has access to the product and for which the stream configuration was created
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    @Import(name="httpsConnector")
    private @Nullable Output<DatastreamHttpsConnectorArgs> httpsConnector;

    public Optional<Output<DatastreamHttpsConnectorArgs>> httpsConnector() {
        return Optional.ofNullable(this.httpsConnector);
    }

    /**
     * Identifies the latest active configuration version of the stream
     * 
     */
    @Import(name="latestVersion")
    private @Nullable Output<Integer> latestVersion;

    /**
     * @return Identifies the latest active configuration version of the stream
     * 
     */
    public Optional<Output<Integer>> latestVersion() {
        return Optional.ofNullable(this.latestVersion);
    }

    @Import(name="logglyConnector")
    private @Nullable Output<DatastreamLogglyConnectorArgs> logglyConnector;

    public Optional<Output<DatastreamLogglyConnectorArgs>> logglyConnector() {
        return Optional.ofNullable(this.logglyConnector);
    }

    /**
     * The username who modified the stream
     * 
     */
    @Import(name="modifiedBy")
    private @Nullable Output<String> modifiedBy;

    /**
     * @return The username who modified the stream
     * 
     */
    public Optional<Output<String>> modifiedBy() {
        return Optional.ofNullable(this.modifiedBy);
    }

    /**
     * The date and time when the stream was modified
     * 
     */
    @Import(name="modifiedDate")
    private @Nullable Output<String> modifiedDate;

    /**
     * @return The date and time when the stream was modified
     * 
     */
    public Optional<Output<String>> modifiedDate() {
        return Optional.ofNullable(this.modifiedDate);
    }

    @Import(name="newRelicConnector")
    private @Nullable Output<DatastreamNewRelicConnectorArgs> newRelicConnector;

    public Optional<Output<DatastreamNewRelicConnectorArgs>> newRelicConnector() {
        return Optional.ofNullable(this.newRelicConnector);
    }

    /**
     * List of email addresses where the system sends notifications about activations and deactivations of the stream
     * 
     */
    @Import(name="notificationEmails")
    private @Nullable Output<List<String>> notificationEmails;

    /**
     * @return List of email addresses where the system sends notifications about activations and deactivations of the stream
     * 
     */
    public Optional<Output<List<String>>> notificationEmails() {
        return Optional.ofNullable(this.notificationEmails);
    }

    @Import(name="oracleConnector")
    private @Nullable Output<DatastreamOracleConnectorArgs> oracleConnector;

    public Optional<Output<DatastreamOracleConnectorArgs>> oracleConnector() {
        return Optional.ofNullable(this.oracleConnector);
    }

    /**
     * The configuration in JSON format that can be copy-pasted into PAPI configuration to enable datastream behavior
     * 
     */
    @Import(name="papiJson")
    private @Nullable Output<String> papiJson;

    /**
     * @return The configuration in JSON format that can be copy-pasted into PAPI configuration to enable datastream behavior
     * 
     */
    public Optional<Output<String>> papiJson() {
        return Optional.ofNullable(this.papiJson);
    }

    /**
     * The ID of the product for which the stream was created
     * 
     */
    @Import(name="productId")
    private @Nullable Output<String> productId;

    /**
     * @return The ID of the product for which the stream was created
     * 
     */
    public Optional<Output<String>> productId() {
        return Optional.ofNullable(this.productId);
    }

    /**
     * Identifies the properties monitored in the stream
     * 
     */
    @Import(name="properties")
    private @Nullable Output<List<String>> properties;

    /**
     * @return Identifies the properties monitored in the stream
     * 
     */
    public Optional<Output<List<String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    @Import(name="s3Connector")
    private @Nullable Output<DatastreamS3ConnectorArgs> s3Connector;

    public Optional<Output<DatastreamS3ConnectorArgs>> s3Connector() {
        return Optional.ofNullable(this.s3Connector);
    }

    @Import(name="splunkConnector")
    private @Nullable Output<DatastreamSplunkConnectorArgs> splunkConnector;

    public Optional<Output<DatastreamSplunkConnectorArgs>> splunkConnector() {
        return Optional.ofNullable(this.splunkConnector);
    }

    /**
     * The name of the stream
     * 
     */
    @Import(name="streamName")
    private @Nullable Output<String> streamName;

    /**
     * @return The name of the stream
     * 
     */
    public Optional<Output<String>> streamName() {
        return Optional.ofNullable(this.streamName);
    }

    /**
     * Identifies the configuration version of the stream
     * 
     */
    @Import(name="streamVersion")
    private @Nullable Output<Integer> streamVersion;

    /**
     * @return Identifies the configuration version of the stream
     * 
     */
    public Optional<Output<Integer>> streamVersion() {
        return Optional.ofNullable(this.streamVersion);
    }

    @Import(name="sumologicConnector")
    private @Nullable Output<DatastreamSumologicConnectorArgs> sumologicConnector;

    public Optional<Output<DatastreamSumologicConnectorArgs>> sumologicConnector() {
        return Optional.ofNullable(this.sumologicConnector);
    }

    private DatastreamState() {}

    private DatastreamState(DatastreamState $) {
        this.active = $.active;
        this.azureConnector = $.azureConnector;
        this.collectMidgress = $.collectMidgress;
        this.contractId = $.contractId;
        this.createdBy = $.createdBy;
        this.createdDate = $.createdDate;
        this.datadogConnector = $.datadogConnector;
        this.datasetFields = $.datasetFields;
        this.deliveryConfiguration = $.deliveryConfiguration;
        this.elasticsearchConnector = $.elasticsearchConnector;
        this.gcsConnector = $.gcsConnector;
        this.groupId = $.groupId;
        this.httpsConnector = $.httpsConnector;
        this.latestVersion = $.latestVersion;
        this.logglyConnector = $.logglyConnector;
        this.modifiedBy = $.modifiedBy;
        this.modifiedDate = $.modifiedDate;
        this.newRelicConnector = $.newRelicConnector;
        this.notificationEmails = $.notificationEmails;
        this.oracleConnector = $.oracleConnector;
        this.papiJson = $.papiJson;
        this.productId = $.productId;
        this.properties = $.properties;
        this.s3Connector = $.s3Connector;
        this.splunkConnector = $.splunkConnector;
        this.streamName = $.streamName;
        this.streamVersion = $.streamVersion;
        this.sumologicConnector = $.sumologicConnector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastreamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastreamState $;

        public Builder() {
            $ = new DatastreamState();
        }

        public Builder(DatastreamState defaults) {
            $ = new DatastreamState(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Defining if stream should be active or not
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Defining if stream should be active or not
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        public Builder azureConnector(@Nullable Output<DatastreamAzureConnectorArgs> azureConnector) {
            $.azureConnector = azureConnector;
            return this;
        }

        public Builder azureConnector(DatastreamAzureConnectorArgs azureConnector) {
            return azureConnector(Output.of(azureConnector));
        }

        /**
         * @param collectMidgress Identifies if stream needs to collect midgress data
         * 
         * @return builder
         * 
         */
        public Builder collectMidgress(@Nullable Output<Boolean> collectMidgress) {
            $.collectMidgress = collectMidgress;
            return this;
        }

        /**
         * @param collectMidgress Identifies if stream needs to collect midgress data
         * 
         * @return builder
         * 
         */
        public Builder collectMidgress(Boolean collectMidgress) {
            return collectMidgress(Output.of(collectMidgress));
        }

        /**
         * @param contractId Identifies the contract that has access to the product
         * 
         * @return builder
         * 
         */
        public Builder contractId(@Nullable Output<String> contractId) {
            $.contractId = contractId;
            return this;
        }

        /**
         * @param contractId Identifies the contract that has access to the product
         * 
         * @return builder
         * 
         */
        public Builder contractId(String contractId) {
            return contractId(Output.of(contractId));
        }

        /**
         * @param createdBy The username who created the stream
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy The username who created the stream
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param createdDate The date and time when the stream was created
         * 
         * @return builder
         * 
         */
        public Builder createdDate(@Nullable Output<String> createdDate) {
            $.createdDate = createdDate;
            return this;
        }

        /**
         * @param createdDate The date and time when the stream was created
         * 
         * @return builder
         * 
         */
        public Builder createdDate(String createdDate) {
            return createdDate(Output.of(createdDate));
        }

        public Builder datadogConnector(@Nullable Output<DatastreamDatadogConnectorArgs> datadogConnector) {
            $.datadogConnector = datadogConnector;
            return this;
        }

        public Builder datadogConnector(DatastreamDatadogConnectorArgs datadogConnector) {
            return datadogConnector(Output.of(datadogConnector));
        }

        /**
         * @param datasetFields A list of data set fields selected from the associated template that the stream monitors in logs. The order of the
         * identifiers define how the value for these fields appear in the log lines
         * 
         * @return builder
         * 
         */
        public Builder datasetFields(@Nullable Output<List<Integer>> datasetFields) {
            $.datasetFields = datasetFields;
            return this;
        }

        /**
         * @param datasetFields A list of data set fields selected from the associated template that the stream monitors in logs. The order of the
         * identifiers define how the value for these fields appear in the log lines
         * 
         * @return builder
         * 
         */
        public Builder datasetFields(List<Integer> datasetFields) {
            return datasetFields(Output.of(datasetFields));
        }

        /**
         * @param datasetFields A list of data set fields selected from the associated template that the stream monitors in logs. The order of the
         * identifiers define how the value for these fields appear in the log lines
         * 
         * @return builder
         * 
         */
        public Builder datasetFields(Integer... datasetFields) {
            return datasetFields(List.of(datasetFields));
        }

        /**
         * @param deliveryConfiguration Provides information about the configuration related to logs (format, file names, delivery frequency)
         * 
         * @return builder
         * 
         */
        public Builder deliveryConfiguration(@Nullable Output<DatastreamDeliveryConfigurationArgs> deliveryConfiguration) {
            $.deliveryConfiguration = deliveryConfiguration;
            return this;
        }

        /**
         * @param deliveryConfiguration Provides information about the configuration related to logs (format, file names, delivery frequency)
         * 
         * @return builder
         * 
         */
        public Builder deliveryConfiguration(DatastreamDeliveryConfigurationArgs deliveryConfiguration) {
            return deliveryConfiguration(Output.of(deliveryConfiguration));
        }

        public Builder elasticsearchConnector(@Nullable Output<DatastreamElasticsearchConnectorArgs> elasticsearchConnector) {
            $.elasticsearchConnector = elasticsearchConnector;
            return this;
        }

        public Builder elasticsearchConnector(DatastreamElasticsearchConnectorArgs elasticsearchConnector) {
            return elasticsearchConnector(Output.of(elasticsearchConnector));
        }

        public Builder gcsConnector(@Nullable Output<DatastreamGcsConnectorArgs> gcsConnector) {
            $.gcsConnector = gcsConnector;
            return this;
        }

        public Builder gcsConnector(DatastreamGcsConnectorArgs gcsConnector) {
            return gcsConnector(Output.of(gcsConnector));
        }

        /**
         * @param groupId Identifies the group that has access to the product and for which the stream configuration was created
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Identifies the group that has access to the product and for which the stream configuration was created
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        public Builder httpsConnector(@Nullable Output<DatastreamHttpsConnectorArgs> httpsConnector) {
            $.httpsConnector = httpsConnector;
            return this;
        }

        public Builder httpsConnector(DatastreamHttpsConnectorArgs httpsConnector) {
            return httpsConnector(Output.of(httpsConnector));
        }

        /**
         * @param latestVersion Identifies the latest active configuration version of the stream
         * 
         * @return builder
         * 
         */
        public Builder latestVersion(@Nullable Output<Integer> latestVersion) {
            $.latestVersion = latestVersion;
            return this;
        }

        /**
         * @param latestVersion Identifies the latest active configuration version of the stream
         * 
         * @return builder
         * 
         */
        public Builder latestVersion(Integer latestVersion) {
            return latestVersion(Output.of(latestVersion));
        }

        public Builder logglyConnector(@Nullable Output<DatastreamLogglyConnectorArgs> logglyConnector) {
            $.logglyConnector = logglyConnector;
            return this;
        }

        public Builder logglyConnector(DatastreamLogglyConnectorArgs logglyConnector) {
            return logglyConnector(Output.of(logglyConnector));
        }

        /**
         * @param modifiedBy The username who modified the stream
         * 
         * @return builder
         * 
         */
        public Builder modifiedBy(@Nullable Output<String> modifiedBy) {
            $.modifiedBy = modifiedBy;
            return this;
        }

        /**
         * @param modifiedBy The username who modified the stream
         * 
         * @return builder
         * 
         */
        public Builder modifiedBy(String modifiedBy) {
            return modifiedBy(Output.of(modifiedBy));
        }

        /**
         * @param modifiedDate The date and time when the stream was modified
         * 
         * @return builder
         * 
         */
        public Builder modifiedDate(@Nullable Output<String> modifiedDate) {
            $.modifiedDate = modifiedDate;
            return this;
        }

        /**
         * @param modifiedDate The date and time when the stream was modified
         * 
         * @return builder
         * 
         */
        public Builder modifiedDate(String modifiedDate) {
            return modifiedDate(Output.of(modifiedDate));
        }

        public Builder newRelicConnector(@Nullable Output<DatastreamNewRelicConnectorArgs> newRelicConnector) {
            $.newRelicConnector = newRelicConnector;
            return this;
        }

        public Builder newRelicConnector(DatastreamNewRelicConnectorArgs newRelicConnector) {
            return newRelicConnector(Output.of(newRelicConnector));
        }

        /**
         * @param notificationEmails List of email addresses where the system sends notifications about activations and deactivations of the stream
         * 
         * @return builder
         * 
         */
        public Builder notificationEmails(@Nullable Output<List<String>> notificationEmails) {
            $.notificationEmails = notificationEmails;
            return this;
        }

        /**
         * @param notificationEmails List of email addresses where the system sends notifications about activations and deactivations of the stream
         * 
         * @return builder
         * 
         */
        public Builder notificationEmails(List<String> notificationEmails) {
            return notificationEmails(Output.of(notificationEmails));
        }

        /**
         * @param notificationEmails List of email addresses where the system sends notifications about activations and deactivations of the stream
         * 
         * @return builder
         * 
         */
        public Builder notificationEmails(String... notificationEmails) {
            return notificationEmails(List.of(notificationEmails));
        }

        public Builder oracleConnector(@Nullable Output<DatastreamOracleConnectorArgs> oracleConnector) {
            $.oracleConnector = oracleConnector;
            return this;
        }

        public Builder oracleConnector(DatastreamOracleConnectorArgs oracleConnector) {
            return oracleConnector(Output.of(oracleConnector));
        }

        /**
         * @param papiJson The configuration in JSON format that can be copy-pasted into PAPI configuration to enable datastream behavior
         * 
         * @return builder
         * 
         */
        public Builder papiJson(@Nullable Output<String> papiJson) {
            $.papiJson = papiJson;
            return this;
        }

        /**
         * @param papiJson The configuration in JSON format that can be copy-pasted into PAPI configuration to enable datastream behavior
         * 
         * @return builder
         * 
         */
        public Builder papiJson(String papiJson) {
            return papiJson(Output.of(papiJson));
        }

        /**
         * @param productId The ID of the product for which the stream was created
         * 
         * @return builder
         * 
         */
        public Builder productId(@Nullable Output<String> productId) {
            $.productId = productId;
            return this;
        }

        /**
         * @param productId The ID of the product for which the stream was created
         * 
         * @return builder
         * 
         */
        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        /**
         * @param properties Identifies the properties monitored in the stream
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<List<String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Identifies the properties monitored in the stream
         * 
         * @return builder
         * 
         */
        public Builder properties(List<String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param properties Identifies the properties monitored in the stream
         * 
         * @return builder
         * 
         */
        public Builder properties(String... properties) {
            return properties(List.of(properties));
        }

        public Builder s3Connector(@Nullable Output<DatastreamS3ConnectorArgs> s3Connector) {
            $.s3Connector = s3Connector;
            return this;
        }

        public Builder s3Connector(DatastreamS3ConnectorArgs s3Connector) {
            return s3Connector(Output.of(s3Connector));
        }

        public Builder splunkConnector(@Nullable Output<DatastreamSplunkConnectorArgs> splunkConnector) {
            $.splunkConnector = splunkConnector;
            return this;
        }

        public Builder splunkConnector(DatastreamSplunkConnectorArgs splunkConnector) {
            return splunkConnector(Output.of(splunkConnector));
        }

        /**
         * @param streamName The name of the stream
         * 
         * @return builder
         * 
         */
        public Builder streamName(@Nullable Output<String> streamName) {
            $.streamName = streamName;
            return this;
        }

        /**
         * @param streamName The name of the stream
         * 
         * @return builder
         * 
         */
        public Builder streamName(String streamName) {
            return streamName(Output.of(streamName));
        }

        /**
         * @param streamVersion Identifies the configuration version of the stream
         * 
         * @return builder
         * 
         */
        public Builder streamVersion(@Nullable Output<Integer> streamVersion) {
            $.streamVersion = streamVersion;
            return this;
        }

        /**
         * @param streamVersion Identifies the configuration version of the stream
         * 
         * @return builder
         * 
         */
        public Builder streamVersion(Integer streamVersion) {
            return streamVersion(Output.of(streamVersion));
        }

        public Builder sumologicConnector(@Nullable Output<DatastreamSumologicConnectorArgs> sumologicConnector) {
            $.sumologicConnector = sumologicConnector;
            return this;
        }

        public Builder sumologicConnector(DatastreamSumologicConnectorArgs sumologicConnector) {
            return sumologicConnector(Output.of(sumologicConnector));
        }

        public DatastreamState build() {
            return $;
        }
    }

}
