package week06;

interface generateReport{
	void generate();
}

interface ExportExcel{
	void excel();
}
interface ExportPDF{
	void pdf();
}

class ReportGenerator implements generateReport{
	@Override
	public void generate() {
		System.out.println("Generating report");
	}
}

class ExcelExporter implements ExportExcel{
	@Override
	public void excel() {
		System.out.println("Exporting to excel");
	}
}
class PDFExporter implements ExportPDF{
	@Override
	public void pdf() {
		System.out.println("Exporting to PDF");
		
	}
}
public class qn04 {
	public static void main(String[] args) {
		ReportGenerator reportgenerator = new ReportGenerator();
		PDFExporter pdfexporter  = new PDFExporter();
		ExcelExporter excelexporter = new ExcelExporter();
		reportgenerator.generate();
		pdfexporter.pdf();
		excelexporter.excel();
	}
}
